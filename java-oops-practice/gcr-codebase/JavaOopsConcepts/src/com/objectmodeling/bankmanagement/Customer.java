package com.objectmodeling.bankmanagement;

import java.util.*;

public class Customer {
	private String name;
	private List<Accounts> accounts;
	
	public Customer(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}
	
	public void addAccounts(Accounts account) {
		accounts.add(account);
	}
	
	public void displayAccounts() {
		System.out.println("Accounts are : " + accounts);
	}

	public void viewBalance() {
		for(Accounts account : accounts) {		
			System.out.println(account);
		}
	}

	public String getName() {
		return name;
	}
}