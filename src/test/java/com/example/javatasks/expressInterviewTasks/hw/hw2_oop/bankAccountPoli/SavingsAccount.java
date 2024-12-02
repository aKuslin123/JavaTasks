package com.example.javatasks.expressInterviewTasks.hw.hw2_oop.bankAccountPoli;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        double percentBalance = getBalance() * 5 / 100;
        setBalance(getBalance() + percentBalance);
        return getBalance();
    }
}
