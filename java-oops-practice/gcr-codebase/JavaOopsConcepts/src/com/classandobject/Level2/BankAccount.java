package com.classandobject.Level2;

public class BankAccount {
	String accountHolder;
	double accountNumber;
	double balance;
	
	public BankAccount(String accountHolder, double accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Deposit Money
	public void depositMoney(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited : " + amount);
		} else {
			System.out.println("Amount must be positive");
		}
	}
	
	// Withdraw money
	public void withdrawMoney(double amount) {
		if(balance >= amount && amount > 0) {
			balance -= amount;
			System.out.println("Withdrawall money : " + amount);
		} else if(amount <= 0) {
			System.out.println("Amount must be positive");
		} else {
			System.out.println("Insufficient balance!");
		}
	}
	
	// Display current balance
	public void displayBalance() {
		System.out.println("Current balance is : " + balance);
	}
}