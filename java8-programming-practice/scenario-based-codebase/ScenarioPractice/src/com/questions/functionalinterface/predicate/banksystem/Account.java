package com.questions.functionalinterface.predicate.banksystem;

public class Account {
	private String name;
	private int balance;
	
	public Account(String name, int balance) {		
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public int getBalance() { 
		return balance;
	}

	@Override
	public String toString() {
		return "Student [name: " + name + ", salary: " + balance + "]";
	}
}