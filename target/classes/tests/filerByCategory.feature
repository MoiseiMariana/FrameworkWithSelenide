@regressionPack
Feature: Filter products by Category

  Scenario: The product is correctly displayed in the right category
    Given open application
    When click on Phones category
    And scroll to the product
    Then the product is displayed in the right category

