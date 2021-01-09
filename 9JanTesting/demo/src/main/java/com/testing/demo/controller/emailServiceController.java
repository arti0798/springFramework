package com.testing.demo.controller;

import com.testing.demo.service.emailService;
import com.testing.demo.service.emailServiceImp;

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
