package com.example.practice.PracticeRESTAPIs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping
    public String healthcheck() {
        return "Your Spring boot application is running...Ok";
    }

}
