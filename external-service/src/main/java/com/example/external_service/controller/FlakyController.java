package com.example.external_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class FlakyController {
    private final Random random = new Random();

    @GetMapping("/flaky-endpoint")
    public String flakyEndpoint() {
        if (random.nextBoolean()) {
            throw new RuntimeException("Simulated failure!");
        }
        return "Successful response from External Service";
    }
}
