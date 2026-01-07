package com.encapsulation.bankmanagementsystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("\nCurrent Account interest: " + interest);
        return interest;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("\nCurrent Account loan application submitted for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        boolean eligible = getBalance() >= 10000;
        System.out.println("\nCurrent Account loan eligibility: " + eligible);
        return eligible;
    }
}