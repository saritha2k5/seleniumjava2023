Feature: Test the CRUD operations in reques.in

  Scenario: create the user
    Given url 'https://reqres.in/api/users/2'
    And request {"name": "morpheus","job": "leader"}
    When method PUT
    Then status 200
    And print response
