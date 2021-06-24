package com.yuzh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String URL_PREFIX = "http://PROVIDER";
    @GetMapping("/hello")
    public String hello() {
        return restTemplate.getForObject(URL_PREFIX + "/hello", String.class);
    }
}
