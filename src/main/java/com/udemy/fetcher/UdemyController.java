package com.udemy.fetcher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UdemyController {

  @GetMapping("/")
  public String home() {
    return "App is running";
  }
}
