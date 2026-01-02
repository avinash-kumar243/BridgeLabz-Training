package com.bankmanagementsystem;

public class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Type: Current");
    }
}
