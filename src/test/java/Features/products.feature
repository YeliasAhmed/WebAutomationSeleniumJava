Feature: Checking product CRUD operations functionality

  #TC_01
  @product
  Scenario: Verify that the product is deleted successfully
    Given Click on the LoginRegister button
    And Click on the I am a vendor radio button
    And Fill up the required field
    Then Check that the product button is available
    When Click on the product Button
    Then Check that the Add new product button is available
    When Click on the Add new Product button
    And Fill the all product details



