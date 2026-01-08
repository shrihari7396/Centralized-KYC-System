package com.rbi.authservice.controller;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class AuthController {

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Object user) {
        return ResponseEntity.ok().build();
    }
}
