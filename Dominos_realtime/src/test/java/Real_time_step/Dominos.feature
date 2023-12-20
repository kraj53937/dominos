Feature: Checking the dominos site End to End

  Scenario: login the webpage of dominos to order pizzas and beverages
    Given user is on dominos website
    When click the order online and navigate to next page
    And click on location button and enter the location pincode details
    And select the veg pizza and beverages sections
    And remove the quantities of the order in the add to cart
    Then check out the orders and close the window
 
 