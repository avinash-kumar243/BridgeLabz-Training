package com.interfaces.defaultmethods.paymentgatewayintegration;


// New Payment Provider
public class NewPaymentProvider implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println("Amount: " + amount + " has been paid by new payment provider"); 
	}
	
	
	@Override  // New Payment provider wants its own logic
	public void refund(double amount) {  
		System.out.println("Amount: " + amount + " refunding by new Payment provider");
	}
}