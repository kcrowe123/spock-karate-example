package com.example.spock.karate

import com.intuit.karate.Runner
import org.spockframework.spring.SpringBean
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiTestRunnerSpec extends Specification {

    @LocalServerPort
    private int port

    @SpringBean
    MessageLogger messageLogger = Mock() {
        1 * logMessage(_ as String) >> { String message ->
            assert message != null
            System.setProperty('message', message)
        }
    }

    def "setup"() {
        System.out.println("Running on port: " + port)
        System.setProperty("server.port", "" + port)
    }

    def "Run Mock ApiTest"() {
        expect:
        Runner.path("classpath:").systemProperty("foo", "bar").tags("~@ignore").parallel(5)
    }
}
