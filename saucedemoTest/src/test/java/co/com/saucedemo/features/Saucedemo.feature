Feature: Saucedemo page

  Scenario : add a product to the shopping cart
    Given User enters saucedemo site
    And User login
    When user add the product to the shopping cart
    Then user verifies that the product of the shopping cart is the same one that was selected


