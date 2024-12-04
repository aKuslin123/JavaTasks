package com.example.javatasks.expressInterviewTasks.hw.hw1_basics;

import java.util.Scanner;

public class innerCycles {
    public static void main(String[] args) {
        //timesTable();
        //rectangle(3, 3);
        //pyramid(3);
        printPrimeNumbers(10);
        sc.close();

    }

    static Scanner sc = new Scanner(System.in);

    /*
    Задача 1: Таблица умножения
    Выведите таблицу умножения от 1 до 10 в формате:
    python
    Copy code
    1 x 1 = 1
    1 x 2 = 2
    ...
    10 x 10 = 100
     */
    public static void timesTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
        }
    }

    /*
    Задача 2: Прямоугольник из звёздочек
Напишите программу, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).
Пример:
markdown

****
****
****
     */
    public static void rectangle(int m, int n) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    Задача 3: Пирамида из звёздочек
Реализуйте программу, которая выводит пирамиду из звёздочек высотой N.
Пример:
markdown

   *
  ***
 *****
     */
    public static void pyramid(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    Задача 4: Поиск простых чисел
Найдите все простые числа от 2 до N. Используйте вложенные циклы для проверки делимости.
Пример:
mathematica

Введите N: 10
Простые числа: 2 3 5 7
     */

    // ищем простые числа, отсеиваем все непростые
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // не простое, если делится на любое число меньше себя
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int n) {
        System.out.print("Простые числа: ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
