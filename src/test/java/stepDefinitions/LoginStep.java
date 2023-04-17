package stepDefinitions;

import Pages.*;
import io.cucumber.java.en.*;

public class LoginStep {
	LoginPage objLoginPage=new LoginPage();
	
	@Given("user launch a application")
	public void launchApplication() {
		objLoginPage.launchApplication();
	}

	@When("user enter email address {string} and password {string}")
	public void enterEmailAndPassword(String email, String password) {
		objLoginPage.enterEmailAndPassword(email,password);
	}

	@When("user click on Login button")
	public void clickOnLoginButton() {
		objLoginPage.clickOnLoginButton();
	}

	@Then("verify user should see Page title {string}")
	public void VerifyPageTitle(String title) {
		
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
