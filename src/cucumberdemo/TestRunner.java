package cucumberdemo;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "stepdefinition" }, snippets = SnippetType.CAMELCASE,  plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class TestRunner {

}
