@Login
Feature: Testing the Login screen Functionalities

  In order to test the Login functionalities
  As a client/pro user
  I want to able to the login the application with valid username and password


  @C1 @Smoke @Regression
  Scenario: To verify client user is able to log in the application with valid username and password
    Given user navigate to the login page
    When the client user enters a valid username and password
    And the user clicks the login button
    Then the client user is successfully logged in

