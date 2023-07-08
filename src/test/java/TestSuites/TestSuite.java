package TestSuites;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@RunWith(CucumberWithSerenity.class)
@CucumberOptions
(
		features = {".\\src\\test\\resources\\Feature\\Catalog_Products.feature"},
		glue = {"stepDefinitions"},
		dryRun = false,
		monochrome = true,
		stepNotifications = true,
		strict=true,
		plugin = {"pretty","html:target/cucumber-report"}
)
public class TestSuite {

}
