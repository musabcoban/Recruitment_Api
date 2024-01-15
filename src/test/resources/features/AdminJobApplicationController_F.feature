@adminJob
Feature: Admin Job Application Controller
  Scenario: As a user should get all Application Job with valid credentials
    Given I make a request with valid credentials for job all job application
    Then Verify response with statuss code 200
    Then Verify response body

    Scenario: As a user should change status job application using jobApplicationId
      Given I make a request with valid credentials for change status job application
      Then Verify response with statuss code 204