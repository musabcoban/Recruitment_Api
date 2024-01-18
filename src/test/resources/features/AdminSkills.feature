Feature: Admin Candidate Skills Controller

  Scenario: As an admin, I should be able to update candidates`skills information in the system

    Given Admin connects to the skills end point with a valid candidate ID and valid skills info
    Then  Verify skills response with status code 204