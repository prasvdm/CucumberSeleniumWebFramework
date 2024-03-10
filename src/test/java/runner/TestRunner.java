package runner;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/java/features",
    glue={"src/main/java/stepdefinitions","src/main/java/utility"},
    plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"}
)
public class TestRunner {

}
