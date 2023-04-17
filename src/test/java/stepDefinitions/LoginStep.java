package stepDefinitions;

import java.io.IOException;
import Pages.*;
import Utilities.Constant;
import Utilities.PropertyFileReader;
import io.cucumber.java.en.*;

public class LoginStep implements Constant{
	PropertyFileReader prop = new PropertyFileReader();
	LoginPage objLoginPage=new LoginPage();
	
	@Given("user launch a application")
	public void launchApplication() {
		objLoginPage.launchApplication();
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
}
