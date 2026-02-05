package com.multithreading.problems.bankingsystem;

import java.time.LocalTime;

public class BankAccount {
	private double balance = 10000;
	
	public synchronized void withdraw(double amount, LocalTime timeStamp, boolean status) {
		if(amount <= balance) {
			System.out.println(Thread.currentThread().getName() + " trying to withdrw " + amount);
			
			try {
				Thread.sleep(1000); 
			} catch(InterruptedException e) {
				System.out.println("Interrupted Exception occurs: ");
				e.printStackTrace();
			}
			
			balance -= amount;
			System.out.println(amount + " withdraw successfully: " + Thread.currentThread().getName() + " || remainig balance: " + balance + " || timeStamp: " + timeStamp);
		} else {
			System.out.println(Thread.currentThread().getName() + " : Insufficient account balance!!!");
		}
	}
}