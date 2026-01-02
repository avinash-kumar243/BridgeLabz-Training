package com.bankmanagementsystem;

public class Main {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount("SA101", 5000, 5);
        sa.deposit(2000);
        sa.calculateInterest();
        sa.withdraw(3000);

        Customer c1 = new Customer("C001", "Rahul", sa);
        c1.showCustomerDetails();

        System.out.println("\n----------------------\n");

        CurrentAccount ca = new CurrentAccount("CA201", 8000);
        ca.deposit(1500);
        ca.withdraw(2000);

        Customer c2 = new Customer("C002", "Priya", ca);
        c2.showCustomerDetails();
    }
}
