package com.example.spock.karate;

import org.springframework.stereotype.Component;

@Component
public class MessageLogger {

  public void logMessage(String message) {
    System.out.println(message);
  }
}
