package com.interfaces.defaultmethods.paymentgatewayintegration;


// Old Payment Provider
public class OldPaymentProvider implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println("Amount: " + amount + " has been paid by old payment provider");
	}
}