package com.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping("Get/hello")
    public String returnHelloMessage(){
        return "Hello World;";
    }

    @GetMapping("/Get/hello/{name}")
    public String greetPerson(@PathVariable String name) {
        return "Hello, " + name;
    }
}
