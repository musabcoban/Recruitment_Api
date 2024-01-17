@msb
Feature: AdminDashboardController
  Scenario: As an admin should see the dashboard data after login
    When I make a request to get dashboard data
    Then Verify response with status code 200
    Then Verify response body contains "dailyRegisterCount"
