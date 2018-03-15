package cucumberdemo;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "stepdefinition" }, snippets = SnippetType.CAMELCASE, plugin = {
		"pretty:target/cucumber-pretty.txt", "html:target/cucumber-html-report", "json:target/cucumber.json",
		"junit:target/cucumber-results.xml" })
public class TestRunner {

}
