package com.thecodealchemist.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping
    public String hi() {
        discoveryClient.getServices().forEach(System.out::println);

        return "Hi";
    }
}
