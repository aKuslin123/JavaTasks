package com.example.javatasks.expressInterviewTasks.hwOne;

import java.util.Scanner;

public class IfSwitchTasks {
    public static void main(String[] args) {
        taskOne();
        sc.close();

    }

    /*
    Задача 1: Проверка чётности числа
    Напишите программу, которая проверяет, является ли число чётным или нечётным.
    Пример:
    Введите число: 8
    Результат: Чётное
     */
    private static Scanner sc = new Scanner(System.in);

    public static void taskOne() {
        System.out.print("Введите число: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
