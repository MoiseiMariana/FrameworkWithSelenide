@regressionPack
Feature: Log in feature
  Scenario: The customer is successfully log in
    Given open application
    When  customer click on Log in button
    And Log in modal window should open
  And customer enters "mariana.moisei" Username
    When enter "CommunityFibre" Password
    And click on Log in button
    Then the log in process is successfully done and Log out button appears on header
