package com.junit.testing_bank_transactions;

public class BankAccount {
	double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Invalid deposit amount!!!");
		}
		
		balance += amount;
		return balance;
 	}
	
	public double withdraw(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Invalid deposit amount!!!");
		}
		
		if(balance >= amount) {
			balance -= amount;
			return balance; 
		} else {
			throw new IllegalArgumentException("Insufficient balance");
		}
	} 
	
	public double getBalance() {
		return balance; 
	}
}