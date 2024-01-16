
#Feature: Admin Candidate Industries
#
#  Scenario:  Candidate Industries with Valid Credentials
#    Given I make a request with valid credentials for candidate industries with candidateId
#    When the request is sent to the endpoint /api/admin/candidate/industries/{candidateId}
#    Then the response status code should be 204
#    And the response body should contain the following industries:
#      | Experience Years ID | Industry ID |
#      | 0                   | 0           |

