Feature: Testing Google functionality

  Scenario: Happy path Google search functionality

    Given User navigates to the Google
    When User searches for Techtorial
    Then User gets more than 10 links on the Google page