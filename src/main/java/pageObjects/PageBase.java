package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    AppiumDriver driver;

    //public static final long WAIT = 10;

//    public PageObjects.PageBase(AppiumDriver appiumdriver){
//        //AppiumFieldDecorator is the method responsible for collecting all elements that has annotations
//        PageFactory.initElements(new AppiumFieldDecorator(appiumdriver),this);
//
//        driver = appiumdriver;
//    }



    public PageBase(AppiumDriver driver)  //Constructor of the class
    {
        this.driver = driver;
    }

    public void waitForVisibility(By e){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(e)));
    }

    public void clear(By e){
        waitForVisibility(e);
        driver.findElement(e).clear();
    }

    public void click(By e){
        waitForVisibility(e);
        driver.findElement(e).click();
    }

    public void addText(By e, String text) throws InterruptedException {
        waitForVisibility(e);
        driver.findElement(e).clear();
        driver.findElement(e).sendKeys(text);
    }

    public  String getAttribute(By e, String attribute){
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
    }
}
