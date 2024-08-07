 @regressionPack
Feature: Contact us form

  Scenario: The customer successfully complete Contact form
    Given open application
    When  click on Contact button
    And Contact form should open
    When enter Contact Email
    And enter Contact Name
    And enter Contact Message
    And click on Send Message button
    Then appears an alert pop up that confirm that the message was sent