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
  * def getMessage = function() { return Java.type('java.lang.System').getProperty('message'); }
  * print 'message value ' + getMessage()
