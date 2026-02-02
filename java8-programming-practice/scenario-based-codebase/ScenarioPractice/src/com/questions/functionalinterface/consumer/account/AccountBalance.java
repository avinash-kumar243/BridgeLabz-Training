package com.questions.functionalinterface.consumer.account;

import java.util.function.Consumer;

public class AccountBalance {
	public static void main(String[] args) {
		
		// Display account balance using Consumer.
		System.out.println("--------------- Displaying account balance using Consumer -------------\n");
		
		Consumer<Integer> displayingAccountBalance = balance -> System.out.println("Current account balance is: " + balance);
		
		displayingAccountBalance.accept(5000); 
	}
}