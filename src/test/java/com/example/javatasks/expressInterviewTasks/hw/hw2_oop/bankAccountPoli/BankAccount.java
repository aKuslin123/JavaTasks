package com.example.javatasks.expressInterviewTasks.hw.hw2_oop.bankAccountPoli;

/*
Абстрактный класс BankAccount:
Поля: accountNumber (номер счета), balance (баланс).
Методы:
Абстрактный метод calculateInterest().
Реализация метода deposit(double amount) для пополнения счета.
Реализация метода withdraw(double amount) с проверкой на достаточность средств.
Класс SavingsAccount:
Наследуется от BankAccount.
Реализует метод calculateInterest(), добавляя 5% годовых к балансу.
Класс CheckingAccount:
Наследуется от BankAccount.
Реализует метод calculateInterest() без начисления процентов.
Инкапсуляция:
Поля accountNumber и balance должны быть приватными, с геттерами и сеттерами.
Полиморфизм:
Используйте массив объектов BankAccount, чтобы показать работу методов для разных типов счетов.
 */
public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public double deposit(double amount) {
        return balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else throw new IllegalArgumentException("На балансе недостаточно денег");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
