package com.inheritance.hierarchicalinheritance.bankmanagementsystem;

public class FixedDepositAccount extends BankAccount {
	protected int fixedAmount;

	public FixedDepositAccount(String accountNumber, int balance, int fixedAmount) {
		super(accountNumber, balance);
		this.fixedAmount = fixedAmount;
	}
	
	public void displayAccountType() {
		System.out.println("Account type: Fixed Deposit Account");
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		displayAccountType();
		System.out.println("Fixed Amount : " + fixedAmount + "\n");
	}
}