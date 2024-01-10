@msb2
Feature: AdminInviteController
  Scenario: As an admin should see the invite data after login
    When I make a request to get invite data
    Then Verify response with status code 200
    Then Verify response body contains "totalCount"