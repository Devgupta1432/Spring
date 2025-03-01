package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/hello/query")
    public String greetUser(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz";
    }

}