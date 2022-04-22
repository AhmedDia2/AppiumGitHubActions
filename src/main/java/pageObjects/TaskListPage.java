package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class TaskListPage extends PageBase{
    public TaskListPage(AppiumDriver appiumdriver) {
        super(appiumdriver);
    }
    private AppiumDriver driver;
    //Getting the Element
//    @AndroidFindBy(id = "Fab")
//    MobileElement addTaskBtn;

    private By addTaskBtn = By.id("fab");

    public void clickAddBtn(){
        click(addTaskBtn);
    }
}
