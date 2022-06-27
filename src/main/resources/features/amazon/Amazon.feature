Feature: Amazon Search functionality

  Scenario: Positive scenario for amazon search

      Given User navigates to Amazon
      When  User searches for Iphone 13 case
      Then  user validates the number  40000 results on top that shown
      And   User validates all headers contains iPhone