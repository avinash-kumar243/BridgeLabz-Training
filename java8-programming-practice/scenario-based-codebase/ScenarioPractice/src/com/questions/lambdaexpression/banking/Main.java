package com.questions.lambdaexpression.banking;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Account> accounts = List.of(new Account("Avi", "AC101", 100),
										 new Account("Aman", "AC102", 1500),
										 new Account("Shankar", "AC103", 800),
										 new Account("Deepu", "AC104", 4000),
										 new Account("Kajal", "AC105", 5000));
		
		
		// 1. Use lambda to check minimum balance rule.
		System.out.println("\n1. ------------- Checking minimum balance rule (min = 1000) ----------------");
		
		Predicate<Account> minimumBalance = account -> account.getAccountBalance() > 1000;
		accounts.stream()
				.filter(minimumBalance)
				.forEach(System.out::println);
		
		
		
		// 2. Use lambda to calculate simple interest.
		System.out.println("\n2. -------------- Use lambda to calculate simple interest ---------------");
		
		TriFunction<Double, Double, Integer, Double> si = (p, r, t) -> (p * r * t) / 100;
		System.out.println("\nSimple interest: " + si.apply(2000.0, 5.0, 3)); 
		
		
		
		// 3. Use lambda to validate withdrawal amount.
		System.out.println("\n3. ------------- Use lambda to validate withdrawal amount ---------------");
		
		BiPredicate<Account, Double> withdrawal = (account, amount) -> amount > 0 && amount < account.getAccountBalance(); 
		System.out.println("\nWithdrawal valid: " + withdrawal.test(accounts.get(0), 1000.0));
		
		
		
		// 4. Use lambda to print account details.
		System.out.println("\n4. ------------- Use lambda to print account details --------------");
		
		Consumer<Account> printAccountDetails = account -> System.out.println(account);
		accounts.forEach(printAccountDetails);
		
		
		
		// 5. Use lambda to compare two account balances.
		System.out.println("\n5. -------------- Use lambda to compare two account balances ----------------");
		
		Comparator<Account> maxBalanceComparator = (a1, a2) -> Double.compare(a1.getAccountBalance(), a2.getAccountBalance());
		System.out.println("Max account balance  ->  " + accounts.stream()
				.max(maxBalanceComparator).get());
		
	}
}