package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CreateTaskPage extends PageBase{

    public CreateTaskPage(AppiumDriver appiumdriver) {
        super(appiumdriver);
    }

//    @AndroidFindBy(id = "editTextTitre")
//    MobileElement taskNameTxt;
//
//    @AndroidFindBy(id = "editTextNote")
//    MobileElement taskDescTxt;
//
//    @AndroidFindBy(id = "action_save")
//    MobileElement saveBtn;

    //private By taskNameTxt = By.id("editTextTitre");
    private  By taskNameTxt = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.EditText[1]");
    private By taskDescTxt = By.id("editTextNote");
    private By saveBtn = By.id("action_save");

    public void enterTaskName(String taskName) throws InterruptedException {
          clear(taskNameTxt);
          addText(taskNameTxt, taskName);
    }

    public void enterDescName(String Desc) throws InterruptedException {
        clear(taskDescTxt);
        addText(taskDescTxt, Desc);
    }

    public void saveBtn(){
        click(saveBtn);
    }


}
