
Feature: Admin Candidate Languages Controller
  Scenario:  As an admin I should able to updates candidates' languages information in the system
    Given Admin connects to the languages end point with a valid candidate ID and valid info
    Then Verify languages response with status code 204