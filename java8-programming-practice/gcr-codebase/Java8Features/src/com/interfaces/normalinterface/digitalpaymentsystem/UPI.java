package com.interfaces.normalinterface.digitalpaymentsystem;

public class UPI implements Payable {

	@Override
	public void pay() {
		System.out.println("UPI payment successfull");
	}
}