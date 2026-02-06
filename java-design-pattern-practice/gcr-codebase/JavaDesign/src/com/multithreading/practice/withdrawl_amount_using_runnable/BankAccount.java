package com.multithreading.practice.withdrawl_amount_using_runnable;

// MyThread class
public class BankAccount implements Runnable{
	private double amount; 
	
	// Aggregation
	private Withdraw withdraw;
	
	public BankAccount(Withdraw withdraw, int amount) {
		this.withdraw = withdraw;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		withdraw.withdrawAmount(withdraw, amount);
	}
}