package com.fundoonotes.messaging.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

// JMS Consumer
@Component
public class JmsReminderConsumer {
	
	// @JmsListener tells Spring :- Listen to this JMS queue and execute this method when a message arrives
	@JmsListener(destination = "password-reset-queue")
	public void handlePasswordResetRequest(String message) {
		
		String parts[] = message.split("\\|");
		
		String email = parts[0];
		String resetToken = parts[1];
		
		sendActualEmail(email, resetToken);
	}

	
	// Consumer do this task
	private void sendActualEmail(String email, String resetToken) {
		
		try {

			Thread.sleep(3000);
			System.out.println("Password reset emil sent to: " + email); 
			
		} catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}