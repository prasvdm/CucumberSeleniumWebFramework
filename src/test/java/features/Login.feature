#Author - PrasanthChockalingam
# Date: 06-Feb-2023
Feature: Feature to test login functionality

  @loginuser
  Scenario Outline: validate new user is able to view after clicking on new Registrations
    Given User navigates to the Gmail login page
    When user enters wrong <gmail> in the email box
    Then user should verify the <errorMessage>

    Examples:
      | gmail              | errorMessage                      |
      | IamGmail@gmail.com | Couldn't find your Google Account |
      | gmail2@gmail.com   | Couldn't find your Google Account |