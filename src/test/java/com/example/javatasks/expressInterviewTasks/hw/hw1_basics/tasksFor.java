package com.example.javatasks.expressInterviewTasks.hw.hw1_basics;

import java.util.Scanner;

public class tasksFor {
    public static void main(String[] args) {
        outputNumsFromOneToTen();
        sumNumsFromOneToN();

    }

    /*
    Задача 1: Вывод чисел от 1 до 10
    Напишите программу, которая выводит все числа от 1 до 10.
    Пример вывода:
    Copy code
    1 2 3 4 5 6 7 8 9 10
     */
    public static void outputNumsFromOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    /*
    Задача 2: Сумма чисел от 1 до N
    Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
    Пример:
    makefile
    Copy code
    Введите N: 5
    Сумма: 15
     */
    public static void sumNumsFromOneToN() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите N: ");
            int N = sc.nextInt();

            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum+=i;
            }

            System.out.println("Сумма: " + sum);
        }
    }
}
