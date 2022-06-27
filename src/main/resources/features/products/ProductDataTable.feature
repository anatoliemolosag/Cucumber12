@productTable
Feature: Validation of Products of DataTable

  Scenario: Validation of New Product Creation

    Given User navigates to product homepage and Clicks Order Button with DataTable
      | Tester |
      | test   |

    When User enters the product information
      | product  | MyMoney |
      | quantity | 4       |
    And  User enters the address information
      | name    | Techtorial   |
      | street  | 2200 E Devon |
      | city    | Des Plaines  |
      | state   | IL           |
      | ZipCode | 60045        |

    And User enters the payment information and process the order
      | cardType   | Visa    |
      | cardNumber | 1213456 |
      | expireDate | 08/24   |
    Then User validates the success message
      | New order has been successfully added. |
    And User clicks View All Orders and validates
      | name       | Techtorial   |
      | street     | 2200 E Devon |
      | city       | Des Plaines  |
      | state      | IL           |
      | zip        | 60045        |
      | product    | MyMoney      |
      | quantity   | 4            |
      | cardType   | Visa         |
      | cardNumber | 1213456      |
      | expireDate | 08/24        |