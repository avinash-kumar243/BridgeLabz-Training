package com.multithreading.practice.withdrawl_amount_using_runnable;

public class Withdraw {
	double balance = 1000;

	public void withdrawAmount(Withdraw account, double amount) {
		
		if(amount <= balance) {
			
			System.out.println(Thread.currentThread().getName() + " withdrawing amount: " + amount); 
			
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				System.out.println("InterruptedException occurs: " + e.getMessage()); 
			}
			
			balance -= amount;
		} else {
			System.out.println("Not enough balance");
		}
	}
}