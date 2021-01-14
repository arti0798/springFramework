package com.example.demo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class smptEmailSender implements emailService {

    private static Log log = LogFactory.getLog(emailServiceImp.class);
    @Override
    public void sendEmail(String emailId, String subject, String mailContent) {
        log.info("STPM EmailId : "+emailId);
        log.info("SMTP Subject : "+subject);
        log.info("SMTP Body : "+mailContent);
        log.warn("This is SMTP ");

    }
    
}
