package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

// this class will be use to configure the beans of
// DummyEmailSender.java and SmtpEMailSender.java as we may dont have
// souce of these class 

@Configuration
public class mailConfig {
   
   @Bean
   @Profile("dev")
   public emailService EmailServiceImp() {

    return new emailServiceImp();
   }
   
   // @Bean
   // @Primary
   @Bean
   @Profile("prod")
   public emailService SmtpEmailSender() {
      
    return new smtpEmailSender();
}
}
