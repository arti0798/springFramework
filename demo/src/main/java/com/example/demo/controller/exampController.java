package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exampController {
    
    //Expose API => http protocol

    @RequestMapping(value = "/hello")
    public String hello() {

        return "Hello jjjjjj";
    }
}
