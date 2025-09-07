package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/hello/{id}")
    public String hello(@PathVariable String id) {
        String a = "3";
        return "Hello " + id + a;
    }

    @PatchMapping("/hello/{id}")
    public String patch(@PathVariable Integer id) {
        return "Hello World";
    }

    @DeleteMapping("/hello/{id}")
    public String delete(@PathVariable Integer id) {
        return "delete";
    }
}
