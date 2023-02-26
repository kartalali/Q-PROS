Feature: add item verification

  Background:
    * user clicks login from header
    * user fills username
    * user fills password
    * user clicks login button

  @erva
  Scenario: user should be able to add an item to cart
    * click on laptop tab
    * pick from item on page and click
    * click add to cart button
    * verify item added
