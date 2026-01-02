package com.objectmodeling.bankmanagement;

public class Accounts {
	private Bank bank;
	private String accountNumber;
	private double balance;
	
	public Accounts(String accountNumber, double balance, Bank bank) {
		this.bank = bank;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String toString() {
		return "Account: " + accountNumber + " | Balance: " + balance + " | Bank: " + bank.getName(); 
	}
	public double getBalance() {
	    return balance;
	}

	public Bank getBank() {
	    return bank;
	}
	public String getAccountNumber() {
        return accountNumber;
    }
}	