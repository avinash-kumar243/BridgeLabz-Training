package com.interfaces.defaultmethods.paymentgatewayintegration;

public class Main {
	public static void main(String[] args) {
		PaymentProcessor paytm = new OldPaymentProvider();
		paytm.pay(10000);
		paytm.refund(10000);
		
		PaymentProcessor newProvider = new NewPaymentProvider();
		newProvider.pay(5000);
		newProvider.refund(5000);
	}
}