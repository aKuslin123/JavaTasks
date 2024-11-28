package com.example.javatasks.expressInterviewTasks.hw.hw2.BankAccountPoli;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance();
    }
}
