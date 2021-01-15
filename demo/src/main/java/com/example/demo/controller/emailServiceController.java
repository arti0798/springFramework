package com.example.demo.controller;

import com.example.demo.service.emailService;
import com.example.demo.service.emailServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailServiceController {
    
    // emailService emailservice = new emailServiceImp();

    // @Autowired
    emailService emailservice;
    @RequestMapping("/sendEmail")
    public String email() {

        emailservice.sendEmail("arti999@gmail.com", "testing", "I m sending email");
        return "Email sent!!!";
    }

    public emailService getEmailservice() {
        return emailservice;
    }

    // @Autowired
    // public void setEmailservice(emailService emailServiceImp) {
    //     this.emailservice = emailservice;
    // }

    // Autowired using contructor
    // @Autowired
    // public void emailServiceController(emailService abc) {
    //         this.emailservice = abc;
    //     }

        @Autowired
        public emailServiceController(emailService dummyBean) {
            this.emailservice = dummyBean;
        }

  
}
