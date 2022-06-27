@regression @smoke
Feature: Login Functionality of WebOrder Page

  Background:
    #Given User navigates to the WebOrder
  @regression @smoke @forfun
  Scenario: Validation of WebOrder Login (positive Scenario)
    #Given User navigates to the WebOrder

    When User provides credentials 'guest1@microworks.com' and 'Guest1!' for WebOrder
    Then User validates the 'ORDER DETAILS - Weborder' from homepage


#    I want you write 3 negative scenario and validate error message

  Scenario: Validation of WebOrder Login (correct username and wrong password(negative scenario))
    #Given User navigates to the WebOrder
    When User provides credentials 'hello2@gmail.com' and 'Guest1!' for WebOrder
    Then User validates 'Sign in Failed' from login page


  Scenario: Validation of WebOrder Login (wrong username and correct password (negative Scenario))
    #Given User navigates to the WebOrder
    When User provides credentials 'guest1@microworks.com' and 'helloWorld!' for WebOrder
    Then User validates 'Sign in Failed' from login page


  Scenario: Validation of WebOrder Login (user does not provide username and password (negative Scenario))
    #Given User navigates to the WebOrder
    When User provides credentials ' ' and ' ' for WebOrder
    Then User validates 'Sign in Failed' from login page




