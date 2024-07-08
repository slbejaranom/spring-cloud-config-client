package com.spring.cloud.starter.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

  @Value("${message}")
  private String configMessage;

  @GetMapping("/")
  public String getMessage() {
    return configMessage;
  }
}
