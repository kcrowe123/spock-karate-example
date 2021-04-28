@mockMessage
@parallel=true
Feature: Test Message

  Scenario: GET

  Given path '/message'
  When method get
  Then status 404