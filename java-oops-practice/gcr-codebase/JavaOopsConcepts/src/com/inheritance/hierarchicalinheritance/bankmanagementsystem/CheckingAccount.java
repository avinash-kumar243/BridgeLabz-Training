package com.inheritance.hierarchicalinheritance.bankmanagementsystem;

public class CheckingAccount extends BankAccount {
	protected double withdrawalLimit;

	public CheckingAccount(String accountNumber, int balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	
	public void displayAccountType() {
		System.out.println("Account type: Checking Account");
	}
	 
	@Override
	public void displayDetails() {
		super.displayDetails();
		displayAccountType();
		System.out.println("Withdrawal Limit : " + withdrawalLimit + "\n");
	}
}