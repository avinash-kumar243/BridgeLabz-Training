package com.fundoonotes.messaging.jms;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

//JMS Producer
@Component
public class JmsReminderProducer {

	// JmsTemplate - class
	private final JmsTemplate jmsTemplate;

	// Constructor Injection
	public JmsReminderProducer(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	 
	
	public void sendPasswordResetRequest(String email, String resetToken) {
		
		String message = email + "|" + resetToken; 
		
		jmsTemplate.convertAndSend("password-reset-queue", message);  
	}
}