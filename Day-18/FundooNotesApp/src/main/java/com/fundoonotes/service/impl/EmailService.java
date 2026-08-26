package com.fundoonotes.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService { 
	
	@Value("${spring.mail.username}")
	private String fromEmail;

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    
    public void sendPasswordResetEmail(String email, String resetToken) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(fromEmail);
        message.setTo(email);
        message.setSubject("Fundoo Notes - Password Reset");

        message.setText(
                "Hello,\n\n"
                + "You requested to reset your Fundoo Notes password.\n\n"
                + "Your password reset token is:\n"
                + resetToken
                + "\n\n" 
                + "Fundoo Notes Team"
        );

        mailSender.send(message);
    }
}