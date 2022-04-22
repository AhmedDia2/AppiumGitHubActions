package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateTaskPage;
import pageObjects.TaskListPage;
import tests.TestBase;

import java.net.MalformedURLException;

public class TaskTable extends TestBase {
    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;

    @Given("Click add new tasks")
    public void clickAddNewTasks() throws MalformedURLException {
        AndroidSetUp();
        createTaskPage = new CreateTaskPage(driver);
        taskListPage = new TaskListPage(driver);
        taskListPage.clickAddBtn();
    }

    @Given("Enter {string} and {string}")
    public void enterAnd(String taskname, String taskdesc) throws InterruptedException {
        createTaskPage.enterTaskName(taskname);
        createTaskPage.enterDescName(taskdesc);
    }

    @Then("Task is added successfully")
    public void taskIsAddedSuccessfully() {
    }
}
