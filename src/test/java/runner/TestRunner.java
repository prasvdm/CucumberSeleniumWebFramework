package runner;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}//"utility",
)
public class TestRunner {

}


