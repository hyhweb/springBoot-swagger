package com.springboot.swagger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/hello")
    public String hello(){
    return "hello";
    }
}
