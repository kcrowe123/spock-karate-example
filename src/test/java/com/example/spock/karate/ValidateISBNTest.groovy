package com.example.spock.karate

import spock.lang.Specification

class ValidateISBNSpec extends Specification {

    def "Check a valid ISBN"() {
        given:
        def validator = new ValidateISBN()

        when:
        def result = validator.checkISBN("0140449116")

        then:
        true == result
    }

    def "Check another valid ISBN"() {
        given:
        def validator = new ValidateISBN()

        when:
        def result = validator.checkISBN("0140177396")

        then:
        true == result
    }

    def "Check an Invalid ISBN"() {
        given:
        def validator = new ValidateISBN()

        when:
        def result = validator.checkISBN("0140449117")

        then:
        false == result
    }

}
