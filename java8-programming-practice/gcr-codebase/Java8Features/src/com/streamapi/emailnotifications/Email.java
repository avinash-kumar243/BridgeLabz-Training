package com.streamapi.emailnotifications;

public class Email {
	private String email;

	public Email(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}
	
	
}