

Feature: Admin Candidate Industries Controller
  Scenario:  As an admin I should able to updates candidates' industries information in the system
    Given Admin connects to the industries end point with a valid candidate ID and valid info
    Then Verify industries response with status code 204