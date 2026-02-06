package com.multithreading.problems.bankingsystem;

import java.time.LocalTime;

public class Transaction implements Runnable {
	BankAccount account;
	private double amount;
	private LocalTime timeStamp;
	private boolean status;
	
	public Transaction(BankAccount account, double amount, LocalTime timeStamp, boolean status) {
		this.account = account;
		this.amount = amount;
		this.timeStamp = timeStamp;
		this.status = status;
	}


	public double getAmount() {
		return amount;
	}
	public LocalTime getTimeStamp() {
		return timeStamp;
	}
	public boolean isStatus() {
		return status;
	}
	
	
	
	@Override 
	public void run() {
		account.withdraw(amount, timeStamp, status);
	}
}