package com.objectmodeling.bankmanagement;

public class Main {
	public static void main(String[] args) {
		// Creating a bank object
		Bank sbi = new Bank("SBI");
		Bank hdfc = new Bank("HDFC");
		
		// Creating a customer object
		Customer mohan = new Customer("Mohan");
		Customer sonu = new Customer("Sonu");
		Customer komal = new Customer("Komal");
		
		// One bank can have multiple customers
		sbi.openAccount(mohan, "SBI100", 100);
		sbi.openAccount(komal, "SBI101", 200);
		hdfc.openAccount(sonu, "HDFC200", 500);
		hdfc.openAccount(mohan, "HDFC201", 1000);
		System.out.println();
		
		mohan.viewBalance();
		komal.viewBalance();
	}
}