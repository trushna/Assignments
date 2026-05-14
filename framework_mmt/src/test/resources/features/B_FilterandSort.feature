@filterandsort
Feature: Validating filterandsort functionality

Scenario: Apply multiple filters to the product list
        Given user is home page
    When enter "T-shirts for Boys" into the search bar
    And  click the search icon or press "Enter"
     When the user selects the "Winter T-Shirts" filter under Type
    And the user selects the "Half Sleeves" filter under Sleeve Length
    Then the page should display "8 Items" as per the applied filters
    Then  the user sorts products by price low to high
