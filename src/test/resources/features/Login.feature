@wip
Feature: Login
  Scenario: As a user should login with valid credentials
    Given I make a request with valid credentials
    Then Verify response with status code 200 and response body
