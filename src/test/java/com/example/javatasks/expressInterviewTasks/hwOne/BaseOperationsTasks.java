package com.example.javatasks.expressInterviewTasks.hwOne;

import java.util.Scanner;

public class BaseOperationsTasks {
    public static void main(String[] args) {
        taskOne();
        sc.close();

    }

    /*
    Задача 1: Сложение и вычитание чисел
    Напишите программу, которая принимает два числа с консоли,
    складывает их и выводит разность.
     */
    private static Scanner sc = new Scanner(System.in);

    public static void taskOne() {
        System.out.println("Print number one");
        double numOne = sc.nextDouble();
        System.out.println("Print number two");
        double numTwo = sc.nextDouble();

        double sum = numOne + numTwo;
        double diff = numOne - numTwo;

        System.out.printf("Сумма: %.2f + %.2f = %.2f%n", numOne, numTwo, sum);
        System.out.printf("Разность: %.2f - %.2f = %.2f%n", numOne, numTwo, diff);
    }
}
