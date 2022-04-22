package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase extends AbstractTestNGCucumberTests {
public AppiumDriver driver;

    public void AndroidSetUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("platformVersion","11.0");
        cap.setCapability("deviceName","Pixel 4 XL AHD");
        cap.setCapability("app",System.getProperty("user.dir")+"/apps/ToDo.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
    }

    public void iOSSetUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "iOS");
        cap.setCapability("automationName","XCUITest");
        cap.setCapability("platformVersion","14.5");
        cap.setCapability("deviceName","iPhone 12");
        cap.setCapability("app",System.getProperty("user.dir")+"/apps/DailyCheck.app");

        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"),cap);
    }

    public void closeDriver(){

        if (null != driver){

            driver.quit();
        }
    }
}
