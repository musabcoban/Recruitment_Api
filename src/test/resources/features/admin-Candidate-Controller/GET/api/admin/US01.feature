Feature: As an admin, I should be able to retrieve all information about a candidate

@hvv
  Scenario: When the admin sends a get request with valid input the status code has to be 200 and the response body must provide all the candidate information
    Given Admin connects to the "/api/admin/candidate/{candidateId}" end point with a valid candidate ID
    Then admin verifies that the Status Code of the response is "200"
    Then admin verifies the response body has mandatory fields