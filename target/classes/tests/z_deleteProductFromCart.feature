@regressionPack
Feature: Delete a product from basket
  Scenario: The product Samsung Galaxy s6 is deleted from basket
    Given open application
    When user click on desired product
    And user add phone to the cart
    When navigate to cart
    And phone should be in the cart
    And click on delete Button
    Then the product disappeared from cart
