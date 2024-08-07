@regressionPack
Feature: Log out process

  Scenario: The customer is log out successfully
    Given open application
    When customer click on Log in button
    And Log in modal window should open
    When customer enters "mariana.moisei" Username
    And enter "CommunityFibre" Password
    And click on Log in button
    And the log in process is successfully done and Log out button appears on header
    When customer click on Log out button
    Then the log out process is successfully done and Log in button appears again