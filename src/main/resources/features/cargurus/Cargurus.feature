Feature: Cargurus searching functionality

  Scenario: Testing for searching a specific car


    Given  User provides car 'Porsche' , '911' , '60188' and  and click search button form home page
    Then User validates header contains 'Porsche 911'
