package stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public WebDriver driver;
	@Before
	public void BeforeScenarios() {
		System.out.println("**********Before Scenarios**********");
		try {
			Thread.sleep(3000);
			/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			PageFactory.initElements(driver, this);
			driver.get("https://admin-demo.nopcommerce.com/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@After
	public void AfterScenarios() throws IOException
	{
		killDriverExe();
	}
	
	public void killDriverExe() throws IOException
	{
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		System.out.println("Killed all chromedriver.exe");
	}
}

