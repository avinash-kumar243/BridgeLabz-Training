package com.constructor.Level1;

public class DisplayBankAccount {
	public static void main(String args[]) {
		
		// Super-class Object
		BankAccount account = new BankAccount(574374422789L, "Ramesh", 2000);
		account.displayBankDetails();
		
		account.deposit(500);
		System.out.println("New Account balance : " + account.getBalance() + "\n");
		account.withdraw(1200);
		System.out.println("New Account balance : " + account.getBalance() + "\n");
		
		
		// Sub-class Object
		SavingsAccount savingAccount = new SavingsAccount(49834598322L, "Akshay", 5000);
		savingAccount.displayBankDetails();
		
		savingAccount.deposit(600);
		System.out.println("Saving Account new balance : " + savingAccount.getBalance() + "\n");
		savingAccount.withdraw(3000);
		System.out.println("Saving Account new balance : " + savingAccount.getBalance() + "\n");
	}
}