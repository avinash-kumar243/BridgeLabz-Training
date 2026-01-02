package com.bankmanagementsystem;

public class Customer {
    private String customerId;
    private String name;
    private Account account;

    public Customer(String customerId, String name, Account account) {
        this.customerId = customerId;
        this.name = name;
        this.account = account;
    }

    public void showCustomerDetails() {
        System.out.println("\nCustomer: " + name + " (ID: " + customerId + ")");
        account.displayInfo();
    }
}
