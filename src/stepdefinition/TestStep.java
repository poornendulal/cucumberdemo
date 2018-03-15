package stepdefinition;

import java.util.logging.Level;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Automation;

public class TestStep {
	WebDriver driver;
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
		System.out.println("Setting environment properties");
		System.setProperty("webdriver.ie.driver", "C:\\iedriver\\IEDriverServer.exe");
		driver = new HtmlUnitDriver();
		java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF); 
		driver.get("http://www.google.co.uk");
	}
	@When("^searched anything$")
	public void searched_anything() throws Throwable {
		System.out.println("Search anything performing");
		char[] operation = { 'i', 'b'};
		String[] control = { "lst-ib", "btnK"};
		String[] testdata = { "this is automation test engineering demo"};
	
		Automation automate = new Automation();
		automate.run(driver, operation, control, testdata);
	}
	@Then("^verify seconds displayed$")
	public void verify_seconds_displayed() throws Throwable {
		System.out.println("Performing verification");
		char[] operation = { 'v'};
		String[] control = { "resultStats" };
		String[] testdata = { "seconds"};
		Automation automate = new Automation();
		automate.run(driver, operation, control, testdata);
		Assert.fail();
		driver.quit();
	}
}
