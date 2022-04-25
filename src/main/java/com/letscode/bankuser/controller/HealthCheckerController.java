package com.letscode.bankuser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckerController {

    @RequestMapping("/health-checker")
    public String check() {
        return "Server running...";
    }
}
