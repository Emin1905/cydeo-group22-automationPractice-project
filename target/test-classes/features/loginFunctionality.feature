@emin
Feature: Login functionality
  As a user, I should be able to log in so that I can land on homepage

  @validCredentials
  Scenario Outline: Users can log in with valid credentials
    When user go to the login page
    And user is on the login page
    Then user should be able to type valid "<Email>" and "<Password>"
    Then user should be able to click the login button


    Examples: Email-Password
      | Email                   | Password     |
      | salesmanager27@info.com | salesmanager |
      | salesmanager27@info.com | salesmanager |
      | salesmanager28@info.com | salesmanager |
      | salesmanager29@info.com | salesmanager |


