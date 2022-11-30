package com.openapi.openapiui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/springdoc-openapi-1")
    public ResponseEntity<?> testController() {
        return ResponseEntity.ok("Test Controller Spring Doc Open Api 1");
    }

    @GetMapping("/springdoc-openapi-2")
    public ResponseEntity<String> testController2() {
        return new ResponseEntity<>("Test Controller Spring Doc Open Api 2", HttpStatus.OK);
    }

}
