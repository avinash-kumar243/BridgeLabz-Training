package com.encapsulation.bankmanagementsystem;

public interface Loanable {
	void applyForLoan(double amount);
	boolean calculateLoanEligibility();
}
