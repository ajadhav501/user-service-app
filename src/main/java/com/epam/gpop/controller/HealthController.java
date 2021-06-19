package com.epam.gpop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abhijeet Jadhav
 * 04-06-2021
 */
@RestController
@RefreshScope
@RequestMapping("/health")
public class HealthController {

    @Value("${health.check.message}")
    private String healthCheckMsg;

    @GetMapping
    public String getHealth(){
        return healthCheckMsg;
    }
}