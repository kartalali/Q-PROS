Feature: add item verification

  Background:
    * user clicks login from header
    * user fills username
    * user fills password
    * user clicks login button
    * click on laptop tab
    * pick from item on page and click
    * click add to cart button
    * verify item added

  @meliserva
  Scenario: user should be able to delete an item to cart
    * click on cart from header
    * click on delete
