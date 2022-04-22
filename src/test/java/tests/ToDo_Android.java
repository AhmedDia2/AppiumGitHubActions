package tests;

import pageObjects.CreateTaskPage;
import pageObjects.TaskListPage;
import utilits.JsonReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class ToDo_Android extends TestBase{

    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;

    @DataProvider(name = "Tasks Data")
    public Object[][] passData () throws IOException, ParseException {

          return JsonReader.getJESONData
                  (System.getProperty("user.dir")+ "/data/TasksData.json"
                          , "Tasks Data", 2);
    }

    @BeforeMethod
    public void CallSetup() throws MalformedURLException {
        AndroidSetUp();

    }

    @Test(dataProvider = "Tasks Data")
    public void ExecuteTest(String TaskName, String TaskDesc) throws InterruptedException {
        createTaskPage = new CreateTaskPage(driver);
        taskListPage = new TaskListPage(driver);

        taskListPage.clickAddBtn();
        createTaskPage.enterTaskName(TaskName);
        createTaskPage.enterDescName(TaskDesc);
        createTaskPage.saveBtn();
        driver.hideKeyboard();

        closeDriver();


    }
}
