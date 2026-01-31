package com.streamapi.emailnotifications;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Email> emails = List.of(new Email("avikumar@gmail.com"),
									 new Email("rohan@gamil.com"),
									 new Email("sachin@gamil.com"),
									 new Email("deepika@gamil.com"));
		
		emails.stream().forEach(email -> System.out.println(sendEmailNotification(email.getEmail())));
	}

	public static String sendEmailNotification(String email) {
		return "Email notification sent to " + email;
	}
} 