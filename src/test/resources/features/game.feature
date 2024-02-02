Feature: Virgin Games Currency API test

  Background: User is on Virgin Games API

    Scenario: Verify that the currency is in GBP
      When  User sends a request to get all the currency GPB data
      Then Verify that the currency is in GBP

  Scenario: Verify that the currency is in EUR
    When  User sends a request to get all the currency EUR data
    Then Verify that the currency is in EUR

