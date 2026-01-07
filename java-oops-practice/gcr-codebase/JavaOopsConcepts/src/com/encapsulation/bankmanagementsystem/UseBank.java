package com.encapsulation.bankmanagementsystem;

public class UseBank {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA101", "Avinash", 8000);
        BankAccount acc2 = new CurrentAccount("CA202", "Rahul", 15000);

        acc1.calculateInterest();
        acc2.calculateInterest();

        acc1.deposit(2000);
        acc2.withdraw(3000);

        Loanable loanAcc1 = (Loanable) acc1;
        Loanable loanAcc2 = (Loanable) acc2;

        loanAcc1.applyForLoan(20000);
        loanAcc1.calculateLoanEligibility();

        loanAcc2.applyForLoan(50000);
        loanAcc2.calculateLoanEligibility();
    }
}