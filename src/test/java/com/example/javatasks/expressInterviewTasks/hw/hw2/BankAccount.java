package com.example.javatasks.expressInterviewTasks.hw.hw2;

/*
Задача 2: Класс для представления банковского счета
Описание:
Создайте класс BankAccount, который будет представлять банковский счет.
Класс должен содержать:
Поля:
Номер счета (accountNumber).
Баланс (balance).
Методы:
deposit(double amount): пополнение счета.
withdraw(double amount): снятие денег с проверкой на достаточность средств.
getBalance(): возвращает текущий баланс.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Сумма должна быть больше нуля");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на балансе");
        }
    }

    public double getBalance() {
        return balance;
    }
}
