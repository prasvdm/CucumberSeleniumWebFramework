#Author - PrasanthChockalingam
# Date: 06-Feb-2023
Feature: Feature to test login functionality

  Scenario: check login in successful with valid credentials
    Given user is on login page
    When  user enters <username> and <password>
    And clicks on login button
    Then user user is navigated to home page



  Scenario Outline: check login in successful with valid credentials
    Given user is on login page
    When  user enters <username> and <password>
    And clicks on login button
    Then user user is navigated to home page

    Examples:
      | username | password |
      | user1    | pass     |
      | user2    | pass     |