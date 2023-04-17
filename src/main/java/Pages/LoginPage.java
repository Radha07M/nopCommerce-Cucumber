package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import PageObjects.*;
public class LoginPage extends LoginObjects{
	public WebDriver driver;
	public void launchApplication()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		PageFactory.initElements(driver, this);
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	}
	public void enterEmailAndPassword(String email, String passwd) {
		username.clear();
		username.sendKeys(email);
		password.clear();
		password.sendKeys(passwd);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnLogoutLink() {
		logOut.click();
	}
	
	public void VerifyPageTitle(String title) {
		
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
}
