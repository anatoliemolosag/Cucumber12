#Feature: Login Functionality of WebOrder Page
#
#  Scenario: Validation of WebOrder Login (positive Scenario)
#    Given User navigates to the WebOrder
#    When User provides correct 'guest1@microworks.com' and 'Guest1!' for WebOrder
#    Then User validates the 'ORDER DETAILS - Weborder' from homepage
#
#
#    I want you write 3 negative scenario and validate error message
#
#  Scenario: Validation of WebOrder Login (correct username and wrong password(negative scenario))
#    Given User navigates to the WebOrder
#    When User provides incorrect 'hello2@gmail.com' and correct 'Guest1!' for WebOrder
#    Then User validates 'Sign in Failed' from login page
#
#
#  Scenario: Validation of WebOrder Login (wrong username and correct password (negative Scenario))
#    Given User navigates to the WebOrder
#    When User provides correct 'guest1@microworks.com' and incorrect 'helloWorld!' for WebOrder
#    Then User validates 'Sign in Failed' from login page
#
#
#   Scenario: Validation of WebOrder Login (user does not provide username and password (negative Scenario))
#     Given User navigates to the WebOrder
#     When User provides empty ' ' and empty ' '
#     Then User validates 'Sign in Failed' from login page




