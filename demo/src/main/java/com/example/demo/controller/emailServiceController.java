package com.example.demo.controller;

import com.example.demo.service.emailService;
import com.example.demo.service.emailServiceImp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailServiceController {
    
    emailService es = new emailServiceImp();
    @RequestMapping("/sendEmail")
    public String email() {

       es.sendEmail("arti999@gmail.com", "testing", "I m sending email");
        return "Email sent!!!";
    }
}
