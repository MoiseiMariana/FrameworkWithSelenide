@regressionPack
Feature: Place an order

  Scenario: The product Samsung Galaxy s6 is added in the cart and the order is successfully placed
    Given open application
    When scroll to the product
    When user click on desired product
    And user add phone to the cart
    When navigate to cart
    When click on Place order button
    And a modal window is open
    And user enter "Mariana" Name
    And user enter "Moldova" Country
    And user enter "Chisinau" City
    And user enter "4567356423891123" Credit card
    And user enter "11" Month
    And user enter "2026" Year
    And click on Purchase button
    Then order is placed and a confirmation message is displayed on the screen
