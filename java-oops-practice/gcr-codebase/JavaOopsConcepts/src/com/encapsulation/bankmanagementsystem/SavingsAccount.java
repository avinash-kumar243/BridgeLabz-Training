package com.encapsulation.bankmanagementsystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("\nSavings Account interest: " + interest);
        return interest;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("\nSavings Account loan application submitted for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        boolean eligible = getBalance() >= 5000;
        System.out.println("\nSavings Account loan eligibility: " + eligible);
        return eligible;
    }
}