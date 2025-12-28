package com.constructor.Level1;

public class SavingsAccount extends BankAccount {
	// Parameterized Constructor
	public SavingsAccount(long accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}
	
	@Override
	public void displayBankDetails() {
		System.out.println("\n................. Sub - class Objects ................");
		super.displayBankDetails();
	}
}