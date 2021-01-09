package com.testing.demo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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
