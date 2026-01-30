package com.interfaces.normalinterface.digitalpaymentsystem;

public class Wallet implements Payable {

	@Override
	public void pay() {
		System.out.println("Wallet payment successfull");
	}
}