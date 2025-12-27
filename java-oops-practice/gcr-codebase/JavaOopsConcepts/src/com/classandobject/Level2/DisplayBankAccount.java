package com.classandobject.Level2;

public class DisplayBankAccount {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Lynda", 123456789, 700.00);
		
		account.displayBalance();
		account.depositMoney(500);
		account.displayBalance();
		
		account.withdrawMoney(100.00);
        account.displayBalance();
        
        account.withdrawMoney(1900.00);
        account.displayBalance();
    }
}	