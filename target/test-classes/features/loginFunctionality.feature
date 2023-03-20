@smoke
Feature: Login functionality
  As a user, I should be able to log in so that I can land on homepage

  @ac1
  Scenario Outline: AC1- User can log in with valid credentials
    When user go to the login page
    And user is on the login page
    Then user should be able to type valid "<Email>" and "<Password>"
    Then user should be able to click the login button
    Then user should land on home page


    Examples: Email-Password
      | Email                   | Password     |
      | salesmanager27@info.com | salesmanager |
      | salesmanager27@info.com | salesmanager |
      | salesmanager28@info.com | salesmanager |
      | salesmanager29@info.com | salesmanager |


@ac2
  Scenario Outline: AC2- User should see "Wrong login/password" message displayed when entering with incorrect credentials

    When user go to the login page
    And user enters invalid "<Email>" and "<Password>"
    And user should be able to click the login button
    Then user sees the Wrong login/password message displayed


    Examples: Email-Password
      | Email                  | Password      |
      | posmanager4@info.com   | possmanager   |
      | posmanager3@info.com   | posmanagerr   |
      | posmanager156@info.com | posmanager123 |
      | posmanager157@info.com | posmanaager   |



@ac3
  Scenario: AC3- User should see the "Please fill out this field" message if the password or username is empty

    When user go to the login page
    When user leaves username box empty
    And user should be able to click the login button
    Then user should see Please fill out this field text on the page
    And user go to the login page
    When User leaves password box empty
    And user should be able to click the login button
    Then user should see Please fill out this field text on the page2




  Scenario: AC4- User should see the password in bullet signs by default while typing (like ****)

    When user go to the login page
    And user enters password
    Then user should see bullet signs by default