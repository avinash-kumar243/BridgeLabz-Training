package com.questions.functionalinterface.consumer.notification;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		
		// Send notification message using Consumer.
		System.out.println("------------ Send notification message using Consumer ------------\n");
		
		Consumer<String> printNotificationMsg = msg -> System.out.println(msg);
		
		printNotificationMsg.accept("Congratulations! You won 7 Crore.");				
	}
}