package com.testing.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testingController {
    
    @RequestMapping("/super")
    public String hello() {

        return "Welcome SuperUser";
    }
}


