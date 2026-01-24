package com.exceptions;

import java.util.Scanner;

@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
public class BankTransactionSystem {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double balance = 10000;
		
		System.out.println("Account balance is: " + balance);
		
		try {
			System.out.println("\nEnter amount to withdraw: ");
			double amount = sc.nextDouble();
			
			balance = withdrawalAmount(balance, amount);
			System.out.println("Withdrawal successful, new balance: " + balance);
		} catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static double withdrawalAmount(double balance, double amount) throws InsufficientBalanceException {
		if(amount < 0) throw new IllegalArgumentException("Invalid amount!");
		if(balance < amount) throw new InsufficientBalanceException("Insufficient balance");
		
		return balance - amount; 
	}
}