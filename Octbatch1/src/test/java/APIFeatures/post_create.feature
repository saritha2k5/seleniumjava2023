Feature: Test the CRUD operations in reques.in

  Scenario: create the user
    Given url 'https://reqres.in/api/users'
    And request {"name": "morpheus","job": "leader"}
    When method POST
    Then status 201
    And print response
