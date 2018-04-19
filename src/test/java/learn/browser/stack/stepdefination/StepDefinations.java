package learn.browser.stack.stepdefination;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import learn.browser.stack.search.SearchPage;

public class StepDefinations {

	public WebDriver driver;
	public SearchPage searchPage;
	public static final String USERNAME = "rajkumar225";
	public static final String AUTOMATE_KEY = "Rq2DFpzspLSEnqyg2UZe";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	@Before
	public void BrowSTest() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "chrome");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "62.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1024x768");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		searchPage = new SearchPage(driver);
	}
	@Given("^try to open google in browser stack$")
	public void try_to_open_google_in_browser_stack(){
		searchPage.OpenURL();
	}
	@When("^i search some$")
	public void i_search_some() throws Throwable {
		searchPage.SearchInGoogle();
	}
	@Then("^i should get respone$")
	public void i_should_get_respone() throws Throwable {
		searchPage.ClickInGoogle();
	}


}
