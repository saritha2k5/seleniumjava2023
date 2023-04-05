Feature: Sample API Test

  Scenario: Get the lst of users
    Given url 'https://reqres.in/api/users?page=2'
    When method GET
    Then status 200
