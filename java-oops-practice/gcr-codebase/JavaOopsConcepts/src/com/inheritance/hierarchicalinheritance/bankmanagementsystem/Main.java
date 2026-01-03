package com.inheritance.hierarchicalinheritance.bankmanagementsystem;

public class Main {
	public static void main(String args[]) {
		BankAccount account1 = new BankAccount("100", 5000);
		account1.displayDetails();
		System.out.println();
		
		SavingsAccount savingsAccount = new SavingsAccount("101", 6000, 5);
		savingsAccount.displayDetails();
		
		CheckingAccount checkingAccount = new CheckingAccount("102", 8000, 20000);
		checkingAccount.displayDetails();
		
		FixedDepositAccount fixedDeposit = new FixedDepositAccount("103", 4000, 2000);
		fixedDeposit.displayDetails();
	}
} 