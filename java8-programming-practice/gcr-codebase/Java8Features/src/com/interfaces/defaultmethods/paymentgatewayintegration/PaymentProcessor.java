package com.interfaces.defaultmethods.paymentgatewayintegration;

public interface PaymentProcessor {
	
	// Abstract method
	void pay(double amount);
	
	// Default method
	default void refund(double amount) {
		System.out.println("Refunding: " + amount + " by standard process:");
	}
}