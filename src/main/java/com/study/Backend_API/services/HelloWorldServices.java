package com.study.Backend_API.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServices {
    public String helloWorld(String name){
        return "Hello World" + name;
    }
}
