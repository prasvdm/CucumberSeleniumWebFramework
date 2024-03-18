package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static pages.GmaiLoginPage.*;

public class GmailLoginSteps {

    @Given("^User navigates to the Gmail login page$")
    public void user_launch_Gmail() {
        launch_Gmail();
    }

    @When("user enters wrong (.*) in the email box")

    public void user_EnterGmail(String usermail) {
        enterGmail(usermail);
    }

    @Then("^user should verify the (.*)$")
    public void asserError(String expectedErrorMessage) {
        String actualErrorMessage = retrieveErrorMessage();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "The following text match the expected value");
    }

}