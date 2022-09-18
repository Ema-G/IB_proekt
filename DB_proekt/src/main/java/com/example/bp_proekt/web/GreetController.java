package com.example.bp_proekt.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greetTheUser(){
        return "Hello user";
    }

    @GetMapping("/")
    public String root(){
        return "this is the root";
    }
}
