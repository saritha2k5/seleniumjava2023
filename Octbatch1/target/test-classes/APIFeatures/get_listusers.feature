Feature: Test the CRUD operations in reques.in

  Scenario: Get the list of users
    Given url getlistuser
    When method GET
    Then status 200
