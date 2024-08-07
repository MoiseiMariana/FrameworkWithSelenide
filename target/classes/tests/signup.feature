@regressionPack
Feature: Sing up process

  Scenario: The customer is sign up successfully
    Given open application
    When customer click on Sign up button
    And Sing up modal should open
    When customer enters a unique username
    And enter "Password7878" password
    And click on Sign up
    When an alert window should appear with confirmation
    And customer click on OK button
    Then the sign up process is successfully done and customer is landing to Home Page