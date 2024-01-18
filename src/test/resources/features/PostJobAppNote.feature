@ZeynepPost
Feature: Post a note for a Job Application
  Scenario: Admin should be able to post a note for a job application by using job application ID
    Given Admin makes a post request by using job applicaion ID
    Then Admin verifies that the status code for the post request is 204