package com.example.Fist_spring_app.controller;

import com.example.Fist_spring_app.domain.User;
import com.example.Fist_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Kepper");
    }

    @PostMapping("/post")
    public String helloWorldPost(@RequestBody User body) {
    return "Hello World " + body.getName();

    }
}