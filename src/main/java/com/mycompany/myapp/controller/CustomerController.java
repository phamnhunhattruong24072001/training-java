package com.mycompany.myapp.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/api")
    public ResponseEntity<?> getJson() {
        return ResponseEntity.ok(Map.of("message", "Hello World", "status", "success"));
    }
}
