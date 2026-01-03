package com.inheritance.hierarchicalinheritance.bankmanagementsystem;

public class SavingsAccount extends BankAccount {
	protected double interestRate;

	public SavingsAccount(String accountNumber, int balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void displayAccountType() {
		System.out.println("Account type: Saving Account");
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		displayAccountType();
		System.out.println("Interest rate: " + interestRate + "\n");
	}
}