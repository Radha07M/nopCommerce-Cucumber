package stepDefinitions;

import java.io.IOException;
import Pages.*;
import Utilities.*;
import io.cucumber.java.en.*;

public class LoginStep implements Constant{
	PropertyFileReader prop = new PropertyFileReader();
	LoginPage objLoginPage = new LoginPage();
	
	@Given("user launch a application")
	public void launchApplication() {
		objLoginPage.launchApplication();
	}

	@When("user enter email address {string} and password {string}")
	public void enterEmailAndPasswordParameters(String email, String password) throws IOException {
		objLoginPage.enterEmailAndPassword(email,password);
	}
	
	@When("user enter email address and password")
	public void enterEmailAndPassword() throws IOException {
		String email = prop.getProperties(Constant.APPDATA_PATH,"username");
		String password = prop.getProperties(Constant.APPDATA_PATH,"password");
		objLoginPage.enterEmailAndPassword(email,password);
	}

	@When("user click on Login button")
	public void clickOnLoginButton() {
		objLoginPage.clickOnLoginButton();
	}
	
	@Then("verify user should see Page title {string} through parameters")
	public void VerifyPageTitleParameter(String title) throws IOException {
		objLoginPage.VerifyPageTitle(title);
	}

	@Then("verify user should see Page title {string}")
	public void VerifyPageTitle(String title) throws IOException {
		String title1 = prop.getProperties(Constant.APPDATA_PATH,title);
		objLoginPage.VerifyPageTitle(title1);
	}

	@When("user click on logout link")
	public void clickOnLogoutLink() {
		
		objLoginPage.clickOnLogoutLink();
	}
	
	@Then("close the browser")
	public void CloseBrowser() {
		objLoginPage.closeBrowser();
	}
	
	@When("user enters email address {string}")
	public void enterMailAddress(String mailId) {
		try {
			mailId = prop.getProperties(Constant.APPDATA_PATH,mailId);
			objLoginPage.enterMailAddress(mailId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	@When("user enters password {string}")
	public void enterPassword(String password) {
		try {
			password = prop.getProperties(Constant.APPDATA_PATH,password);
			objLoginPage.enterPassword(password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Then("verify user should able to see error message {string}")
	public void verifyFieldsErrorMsgOnLogin(String msg) {
		try {
			msg = prop.getProperties(Constant.ERRORMESSAGE_PATH,msg);
			objLoginPage.verifyFieldsErrorMsgOnLogin(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Then("verify user should able to see error summary message {string}")
	public void verifySummaryErrorMsgOnLogin(String msg) {
		try {
			msg = prop.getProperties(Constant.ERRORMESSAGE_PATH,msg);
			objLoginPage.verifySummaryErrorMsgOnLogin(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@When("user logged into an application")
	public void userLoggedIntoApplication(){
		try {
			String email = prop.getProperties(Constant.APPDATA_PATH,"username");
			String password = prop.getProperties(Constant.APPDATA_PATH,"password");
			objLoginPage.enterEmailAndPassword(email,password);
			objLoginPage.clickOnLoginButton();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
