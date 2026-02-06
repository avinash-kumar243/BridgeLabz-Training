package com.multithreading.practice.withdrawl_amount_using_runnable;

public class MyAccount {
	public static void main(String[] args) {
		Thread t1 = new Thread(new BankAccount(new Withdraw(), 1500));
		
		t1.start();
	}
}