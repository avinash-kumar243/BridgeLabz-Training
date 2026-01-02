package com.objectmodeling.bankmanagement;

import java.util.*;

public class Bank {
	private String name;
	private List<Customer> customers;
	
	public Bank(String name) { 
		this.name = name;
		this.customers = new ArrayList<>();
	}
	
	public void displayCustomerDetails() {
		System.out.println("All the customers of a bank is " + name);
		for(Customer customer : customers) {
			System.out.println("Customer is : " + customer);
		}
	}
	
	public void openAccount(Customer customer, String accountNumber, int balance) {
		Accounts account = new Accounts(accountNumber, balance, this);
		
		customer.addAccounts(account);
		customers.add(customer);	
		
		System.out.println("Account opened for " + customer.getName() +
                " at " + name + " with A/C No: " + accountNumber);
	}

	public String getName() {
		return this.name;
	}
	
}