package com.fundoonotes.messaging.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fundoonotes.service.impl.EmailService; 

@Component
public class JmsReminderConsumer {
 
    private final EmailService emailService;

    public JmsReminderConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @JmsListener(destination = "password-reset-queue")
    public void handlePasswordResetRequest(String message) {

        String[] parts = message.split("\\|");

        String email = parts[0];
        String resetToken = parts[1];

        emailService.sendPasswordResetEmail(email, resetToken);

        System.out.println("Password reset email sent to: " + email);
    }
}