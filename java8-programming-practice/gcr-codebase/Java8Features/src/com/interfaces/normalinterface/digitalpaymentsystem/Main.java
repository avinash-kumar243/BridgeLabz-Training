package com.interfaces.normalinterface.digitalpaymentsystem;

public class Main {
	public static void main(String[] args) {
		Payable upi = new UPI();
		Payable creditCard = new CreditCard();
		Payable wallet = new Wallet();
		
		upi.pay();
		creditCard.pay();
		wallet.pay();
	}
}