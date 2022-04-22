package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateTaskPage;
import pageObjects.TaskListPage;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTask extends TestBase {
    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;

    @Given("Click add new task")
    public void clickAddNewTask() throws MalformedURLException {
        AndroidSetUp();
        createTaskPage = new CreateTaskPage(driver);
        taskListPage = new TaskListPage(driver);
        taskListPage.clickAddBtn();
    }

    @Given("Enter TaskName")
    public void enterTaskName() throws InterruptedException {
        createTaskPage.enterTaskName("Task 1");
    }

    @Given("Enter TaskDesc")
    public void enterTaskDesc() throws InterruptedException {
        createTaskPage.enterDescName("Desc 1");
    }

    @When("Click Save")
    public void clickSave() {
        createTaskPage.saveBtn();
        driver.hideKeyboard();
    }

    @Then("Task added successfully")
    public void taskAddedSuccessfully() {
    }
}
