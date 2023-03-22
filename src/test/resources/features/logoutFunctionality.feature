@all
Feature: Logout feature


  @logoutAC1
  Scenario: AC1- User can log out and ends up in login page.

    When user go to the login page
    And user enters email and password
    And user should be able to click the login button
    And user is on the homepage
    And user clicks on his own username at the top right corner
    And user clicks on logout button
    Then user is on the login page



    @logoutAC2
  Scenario:  AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.

    When user go to the login page
    And user enters email and password
    And user should be able to click the login button
    And user is on the homepage
    And user clicks on his own username at the top right corner
    And user clicks on logout button
    Then user clicks the go back button
    And user stays on the login page




  Scenario:  AC3- The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)

    When user go to the login page
    And user enters email and password
    And user should be able to click the login button
    And user is on the homepage
    And user clicks on his own username at the top right corner
    And user clicks on logout button
    Then user go to the login page