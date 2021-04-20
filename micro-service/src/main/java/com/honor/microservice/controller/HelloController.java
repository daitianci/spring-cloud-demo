package com.honor.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aservice")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
