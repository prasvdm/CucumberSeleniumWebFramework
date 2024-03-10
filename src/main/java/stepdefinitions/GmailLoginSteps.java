package stepdefinitions;

import io.cucumber.java.en.Given;

import static pages.GmaiLoginPage.*;

public class GmailLoginSteps{

    @Given("^User navigates to the Gmail login page$")
        public void user_launch_Gmail(){
        launch_Gmail();
        }



}