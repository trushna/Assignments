@addtocart
Feature: Add to cart and validate product details

  Scenario: Validate product details from listing to product page
: Add a product to cart and verify details
        Given user is home page
    When enter "T-shirts for Boys" into the search bar
    And  click the search icon or press "Enter"
     When the user selects the "Winter T-Shirts" filter under Type
    And the user selects the "Half Sleeves" filter under Sleeve Length
    Then the page should display "8 Items" as per the applied filters
    When the user sorts products by price low to high
    And user clicks on first product
    Then product details should match with listing page
    And the user clicks on "ADD TO CART" button
    Then the product should be successfully added to the cart

    