Feature: WebOrder Login functionality with scenario Outline

  Background:
    Given User navigates to the WebOrder

  Scenario: Validation of WebOrder positive Login Scenario
    When User provides credentials 'guest1@microworks.com' and 'Guest1!' for WebOrder
    Then User validates the 'ORDER DETAILS - Weborder' from homepage

  Scenario Outline: Validation of WebOrder negative Login Scenario
    When User provides credentials '<username>' and '<password>' for WebOrder
    Then User validates '<message>' from login page
    Examples:
    #convert this format into scenario outline.And do 9 different negative scenario

  | username | password | message |
  | hello2@gmail.com      | Guest1!   | Sign in Failed |
  | guest1@microworks.com | hello     | Sign in Failed |
  | maricel@gmail.com     | hello     | Sign in Failed |
  |                       |           | Sign in Failed |
  | 123456789@gmail.com   | alphabet  | Sign in Failed |
  | alphabet@gmail.com    | 123456789 | Sign in Failed |
  | GUEST1@gmail.com      | Guest1!   | Sign in Failed |
  | hello2@gmail.com      | !@#$%^&*( | Sign in Failed |
  | VISION@gamil.com      | GUEST1!   | Sign in Failed |
