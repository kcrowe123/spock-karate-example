package com.example.spock.karate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  @Autowired private MessageLogger messageLogger;

  @GetMapping("/message")
  public String message() {
    String message = "Important Message";

    messageLogger.logMessage(message);

    return message;
  }
}
