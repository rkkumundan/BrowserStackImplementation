package learn.browser.stack.search;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	private WebDriver webDriver;
    public SearchPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
	public void OpenURL() {
        webDriver.get("http://www.google.com");    
        webDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        }
	public void SearchInGoogle() {
		webDriver.findElement(By.name("q")).sendKeys("Rajkumar");
	}
	public void ClickInGoogle() {
		webDriver.findElement(By.name("q")).submit();
	}
}
