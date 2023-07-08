package stepDefinitions;

import java.io.IOException;

import Pages.*;
import Utilities.*;
import io.cucumber.java.en.*;

public class CommonStep {
	PropertyFileReader prop = new PropertyFileReader();
	CommonMethods cmMethods = new CommonMethods();
	
	@When("user clicks on left navigation menu {string}")
	public void clickOnLeftNavMenu(String menu){
		cmMethods.clickOnLeftNavMenu(menu);
	}
	
	@Then("verify success alert message {string}")
	public void verifyAlertMessage(String message) {
		try {
			message = prop.getProperties(Constant.SUCCESSMESSAGE_PATH,message);
			cmMethods.verifyAlertMessage(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("verify form title {string}")
	public void verifyFormTitle(String pageName){
		try {
			pageName = prop.getProperties(Constant.APPDATA_PATH,pageName);
			cmMethods.verifyFormTitle(pageName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
