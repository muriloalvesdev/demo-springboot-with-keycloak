package com.medium.demospringbootwithkeycloak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
class TestController {

  @GetMapping("/anonymous")
  public ResponseEntity<String> getAnonymous() {
    return ResponseEntity.ok("Endpoint anonymous");
  }

  @GetMapping("/user")
  public ResponseEntity<String> getUser() {
    return ResponseEntity.ok("Endpoint user");
  }

  @GetMapping("/admin")
  public ResponseEntity<String> getAdmin() {
    return ResponseEntity.ok("Endpoint admin");
  }

  @GetMapping("/all-user")
  public ResponseEntity<String> getAllUser() {
    return ResponseEntity.ok("Endpoint all users");
  }
}
