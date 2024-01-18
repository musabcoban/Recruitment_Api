@ZeynepGet2
Feature: Admin should be able to check and read messages that are send for job application
  Scenario: Admin should be able to read messages for applied jobs by using job app id
    Given Admin makes a get request by using correct job application ID
    Then Admin should be able to verify that statu code for the request is 200 and the message is visible

