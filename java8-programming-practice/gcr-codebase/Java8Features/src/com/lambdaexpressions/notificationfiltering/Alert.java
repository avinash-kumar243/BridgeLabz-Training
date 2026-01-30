package com.lambdaexpressions.notificationfiltering;

public class Alert {
	private String message;
	private String type; // Emergency, Bill, Medicine, Notice
	
	public Alert(String message, String type) {
		this.message = message;
		this.type = type;
	}

	// Getters for Alerts
	public String getMessage() {
		return message;
	}
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Alert [message=" + message + ", type=" + type + "]";
	}
}