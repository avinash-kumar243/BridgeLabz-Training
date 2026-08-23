package com.fundoonotes.messaging;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReminderProducer {

	// JmsTemplate - class
	private final JmsTemplate jmsTemplate;

	// Constructor Injection
	public ReminderProducer(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	 
	
	public void sendPasswordResetRequest(String email, String resetToken) {
		
		String message = email + "|" + resetToken; 
		
		jmsTemplate.convertAndSend("password-reset-queue", message);  
	}
}