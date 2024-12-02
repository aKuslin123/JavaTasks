package com.example.javatasks.expressInterviewTasks.hw.hw2_oop.bankAccountPoli;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance();
    }
}
