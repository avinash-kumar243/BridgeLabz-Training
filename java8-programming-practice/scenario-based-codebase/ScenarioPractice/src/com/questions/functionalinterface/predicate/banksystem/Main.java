package com.questions.functionalinterface.predicate.banksystem;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Account a1 = new Account("Komal", 12000);
		Account a2 = new Account("Sohan", 8000);

		
		// In a bank application, validate whether withdrawal amount is valid using Predicate.
		Predicate<Account> p = account -> account.getBalance() > 10000;
		
		System.out.println("Does 10,000 is a valid amount to withdraw for Komal -> " + p.test(a1));
		System.out.println("Does 10,000 is a valid amount to withdraw for Sohan -> " + p.test(a2));

	}
}