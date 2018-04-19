package learn.browser.stack.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucumber-reports"}, features = "Features", 
						glue="learn.browser.stack.stepdefination", monochrome = true)
public class Runner {

}