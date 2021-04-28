package com.example.spock.karate

import com.intuit.karate.Results
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiTestRunnerSpec extends Specification {
    def "Run Mock ApiTest"() {
        given:

        when:
        when:
        Results results = Runner.path("classpath:/mock/").tags("@mockMessage", "~@ignore").parallel(5)

        then:
        results != null
    }
}
