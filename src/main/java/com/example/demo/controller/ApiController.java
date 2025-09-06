package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/hello/{id}")
    public String hello(@PathVariable String id) {
        String a = "2";
        return "Hello " + id + a;
    }

    @PatchMapping("/hello/{id}")
    public String patch(@PathVariable Integer id) {
        return "Hello World";
    }
}
