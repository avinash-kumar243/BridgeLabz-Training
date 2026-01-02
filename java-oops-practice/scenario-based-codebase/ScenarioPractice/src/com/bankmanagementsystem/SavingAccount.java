package com.bankmanagementsystem;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
