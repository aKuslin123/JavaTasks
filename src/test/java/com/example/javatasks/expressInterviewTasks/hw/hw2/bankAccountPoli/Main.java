package com.example.javatasks.expressInterviewTasks.hw.hw2.bankAccountPoli;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("checking1234", 1000);
        SavingsAccount savingsAccount = new SavingsAccount("savings5678", 1000);
        List<BankAccount> accounts = List.of(checkingAccount, savingsAccount);

        System.out.println(accounts);
        for(BankAccount account : accounts) {
            account.deposit(1000);
            account.withdraw(500);
            account.calculateInterest();
        }
        System.out.println("5% year: " + accounts);
    }
}
