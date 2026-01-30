package com.interfaces.normalinterface.digitalpaymentsystem;

public class CreditCard implements Payable {

	@Override
	public void pay() {
		System.out.println("Credit Card payment successfull");
	}
}