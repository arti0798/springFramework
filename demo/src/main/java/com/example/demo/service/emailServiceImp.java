package com.example.demo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// the class which we want to instantiate at run time can be define with annotation @component
// @Component("dummyBean")
// @Primary


public class emailServiceImp implements emailService{


    private static Log log = LogFactory.getLog(emailServiceImp.class);
    @Override
    public void sendEmail(String emailId, String subject, String mailContent) {
        log.info("EmailId : "+emailId);
        log.info("Subject : "+subject);
        log.info("Body : "+mailContent);
        log.warn("This is dummy");


    }
    
}
