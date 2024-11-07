package com.study.Backend_API.controller;

import com.study.Backend_API.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.Backend_API.services.HelloWorldServices;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController{

    @Autowired
    private HelloWorldServices helloWorldServices;

    @GetMapping
    public String helloWorld(){
        return helloWorldServices.helloWorld(
             " david"
        );
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){
        return "Hello World " + body.getName();
    }
}