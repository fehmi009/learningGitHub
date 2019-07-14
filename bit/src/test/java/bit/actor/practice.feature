Feature: Calling another feature file

  Background: 
    * call read('classpath:bit/utils/utils.feature')

  Scenario: Calling utils feature file
    Given url baseUrl + 'actor'
    And request
      """
      {
      "first_name": "Test",
      "last_name": "Tester"
      }
      """
    Then method post
    And status 201
    Then method get
    * def convertToString = "" + response
    And match convertToString contains 'Test'

  Scenario: Get Id of The Actor - Update
    Given url baseUrl + 'actor?first_name=eq.Test'
    Then method get
    And status 200
    * def actor_id_from_response = response.actor_id
    * print actor_id_from_response
    Given url baseUrl + 'actor?actor_id=eq.' + actor_id_from_response
    * def requestBody = {"actor_id":240, "first_name":"Test","last_name":"Tester","last_update":"2019-05-27T10:00:27.875535"}
    * set requestBody.actor_id = actor_id_from_response
    * set requestBody.first_name = 'Test'
    Then request requestBody
    And method put
    Given url baseUrl + 'actor?actor_id=eq.' + actor_id_from_response
    And method get
    And match response[0].first_name == 'Test'

  Scenario: Delete Actor
    Given url baseUrl + 'actor?first_name=eq.Test'
    Then method get
    * def actorID_from_response = response[0].actor_id
    Given url baseUrl + 'actor?actor_id=eq.' + actorID_from_response
    And method delete
    And status 204
    Given url baseUrl + 'actor'
    And method get
    And match "" + response !contains 'Test'
