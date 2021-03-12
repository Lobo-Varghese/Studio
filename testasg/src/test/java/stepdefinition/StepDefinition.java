package stepdefinition;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.asg.utility.FileUtilities;
import com.asg.utility.Reports;
import com.asg.utility.Screenshots;
import com.asg.utility.browserutility;
import com.codoid.products.exception.FilloException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testasg.Control_Button;
import testasg.commonfunctionsinStudio;
import testasg.savepreviewUIModel;
import testasg.textcontrolVerification;


public class StepDefinition extends commonfunctionsinStudio{
	
@Given("project \"([^\"]*)\" get open")
public void project_get_open(String arg1) throws Exception {
	 browserutility openbrowser=new browserutility();
// openbrowser.OpenBrowser();
    openbrowser.OpenProject(arg1);
}

@When("UIModel \"([^\"]*)\" get open")
public void uimodel_get_open(String uimodelname) throws Exception {
	System.out.println(uimodelname);
	Expandfolder("UI Models");
	Thread.sleep(15000);
	WebElement openUImodel=driver.findElement(By.xpath("//*[text()='"+uimodelname+"']"));
	System.out.println(openUImodel);
	openUImodel.click();
	Thread.sleep(4000);
//	Reports.report("UIModel Opened", "UIModel", "UI Model Get Open");
}

@Then("enter the button id for the button control")
public void enter_the_button_id_for_the_button_control() throws InterruptedException, IOException {
    Control_Button cb=new Control_Button();
    cb.buttonPropertyID();
   // Reports.report("Button ID added", "UIModel", "enter the button id for the button control");
}
@Then("save and preview the UI Model")
public void save_and_preview_the_ui_model() throws InterruptedException, IOException {
	savepreviewUIModel savepreview=new savepreviewUIModel();
	savepreview.savepreview();
	WebElement expected=savepreview.verifypreviewcontent("View-1");
	Screenshots.highlightandtakescreenshot(expected);
	Reports.report("Preview is successful","UIModel","save and preview the UI Model");
	
	
}

@Then("search text control and enter the text id for the textinput control")
public void search_text_control_enter_the_text_id_for_the_textinput_control() throws InterruptedException, IOException{
	textcontrolVerification tcv=new textcontrolVerification();
			tcv.textPropertyID();
	//		Reports.report("Text Id entered", "UIModel", "search text control and enter the text id for the textinput control");
}

@Then("getdata from excel")
public void getdata_from_excel() throws IOException, FilloException
{
//ArrayList<String> b=FileUtilities.getdata("Button-Single");
HashMap<String,String> objHm=FileUtilities.getDataUsingFillo("Button-Single");
System.out.println(objHm.get("buttonid"));
System.out.println(objHm.get("type"));
System.out.println(objHm);
//Reports.report("Preview is successful");
	}
}

	
