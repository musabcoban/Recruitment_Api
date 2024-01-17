
  Feature: Get Job Application Details as Admin by Using Job Application ID
    Scenario: Admin should be able to see details of the job application
      Given Admin makes a get request by using job application ID
      Then Admin verifies that response status code is 200 and response body