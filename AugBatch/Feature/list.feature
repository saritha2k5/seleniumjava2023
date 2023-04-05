Feature: get request

  Scenario: get the list of users
    Given get url1 "https://reqres.in/api/users?page=2"
    Given get url2 "https://reqres.in/api/users/23"
    Given get url3 "https://reqres.in/api/unknown"
    Given get url4 "https://reqres.in/api/unknown/2"
   	
    