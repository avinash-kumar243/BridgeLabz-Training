package com.inheritance.hierarchicalinheritance.bankmanagementsystem;

public class BankAccount {
	protected String accountNumber;
	protected int  balance;
	
	public BankAccount(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void displayDetails() {
		System.out.println("Account number: " + accountNumber + " || current balance: " + balance);
	}
}