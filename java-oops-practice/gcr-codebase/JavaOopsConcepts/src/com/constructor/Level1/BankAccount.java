package com.constructor.Level1;

public class BankAccount {
	public long accountNumber;
	protected String accountHolder;
	private double balance;
	
	// Parameterized Constructor
	public BankAccount(long accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	// Getter and Setter method
	public double getBalance() {
		return balance;
	}
	
	// Deposit Money
	public void deposit(double amount) {
		if(amount >= 0) {
			balance += amount;
			System.out.println(amount + " - Amount successfully deposited");
		}
		else System.out.println("Invalid amount!");
	}
	
	// Withdraw Money
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(amount + " - Amount successfully withdrawl");
		} else {
			System.out.println("Insufficient Amount!");
		}
	}
	
	// Display Bank Account Details
	public void displayBankDetails() {
		System.out.println("\nAccount number : " + accountNumber);
		System.out.println("Account holder name : " + accountHolder);
		System.out.println("Account balance : " + balance + "\n");
	}
}