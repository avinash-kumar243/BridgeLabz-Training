package com.questions.lambdaexpression.banking;

public class Account {
	private String accountHolderName;
	private String accountNumber;
	private int accountBalance;
	
	public Account(String accountHolderName, String accountNumber, int accountBalance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "Account [accountHolderName: " + accountHolderName + ", accountNumber: " + accountNumber
			 + ", accountBalance: " + accountBalance + "]";
	}
}