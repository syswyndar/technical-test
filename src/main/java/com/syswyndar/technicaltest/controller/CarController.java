package com.syswyndar.technicaltest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping("")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("Server Running");
    }
}
