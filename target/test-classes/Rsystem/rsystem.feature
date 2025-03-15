Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given User is on Login Page
    When User enters valid username and password
    Then User should be logged in successfully