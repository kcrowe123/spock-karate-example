@mockMessage
@parallel=true
Feature: Test Message

  Background:
    * url localUrl

  Scenario: GET

  Given path '/message'
  When method get
  Then status 200

  * print 'foo value ' + karate.properties['foo']
  * def getMessage =
    """
    function() {
      var MessageHolder = Java.type('com.example.spock.karate.ApiTestRunnerSpec.MessageHolder');
      return MessageHolder.INSTANCE.getMessage();
    }
    """
  * def message = call getMessage {}
  * print 'message value ' + message
