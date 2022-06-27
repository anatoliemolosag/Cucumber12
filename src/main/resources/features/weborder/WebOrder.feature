@regression @smoke
Feature: WebOrder page Food Order Functionality

       Background:
              #Given User navigates to the WebOrder

              Given User provides credentials 'guest1@microworks.com' and 'Guest1!' for WebOrder
              When User validates the 'ORDER DETAILS - Weborder' from homepage
              And User clicks Group Order Box and Next Button
              And User sends the word 'Test' for Note to Invitees part
              And User send e-mail addresses which are 'ahmet@gmail.com' and 'berkay@gmail.com'

       Scenario: Testing the webOrder functionality for House

              And User chooses delivery 'My House' and validates the address '1854 Empire Blvd'
              And User clicks create group oder button.
              Then User validates the header of page is  'View Group Orders'
              And User validates total participant is 1


       Scenario: Testing the webOrder functionality Office

              And User chooses delivery 'Office' and validates the address '2012 EMPIRE BLVD'
              And User clicks create group oder button.
              Then User validates the header of page is  'View Group Order'
              And User validates total participant is 1







