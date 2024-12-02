package com.example.javatasks.expressInterviewTasks.hw.hw1_basics;

import java.util.Scanner;

public class BaseOperationsTasks {
    public static void main(String[] args) {
        //taskOne();
        //calculateRectangleArea();
        //remainderDivision();
        //fromCToF();
        swapNumbers(5, 10);
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

    /*
    Задача 2: Площадь прямоугольника
    Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.
    Пример:
    makefile
    Copy code
    Ширина: 4
    Длина: 6
    Площадь: 24
     */
    public static void calculateRectangleArea() {
        System.out.println("enter width: ");
        double width = sc.nextDouble();
        System.out.println("enter length: ");
        double length = sc.nextDouble();

        double area = width * length;
        System.out.println(area);
    }

    /*
    Задача 3: Операции с остатком от деления
    Запросите у пользователя два числа и выведите результат их деления и остаток от деления.
    Пример:
    makefile
    Copy code
    Введите первое число: 17
    Введите второе число: 3
    Результат деления: 5
    Остаток: 2
     */
    public static void remainderDivision() {
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Результат деления: " + firstNumber / secondNumber);
        System.out.println("Остаток: " + firstNumber % secondNumber);
    }

    /*
    Задача 4: Перевод градусов Цельсия в Фаренгейты
    Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
    Формула: F = C * 9/5 + 32.
    Пример:
    Copy code
    Введите температуру в Цельсиях: 25
    Температура в Фаренгейтах: 77
     */
    public static void fromCToF() {
        System.out.println("Enter C: ");
        int c = sc.nextInt();

        int f = 9 / 5 * c + 32;
        System.out.println(f);
    }

    /*
    Задача 5: Обмен значениями переменных
    Поменяйте значения двух переменных местами без использования третьей переменной.
    Пример:
    less
    Copy code
    До обмена: a = 5, b = 10
    После обмена: a = 10, b = 5
     */
    public static void swapNumbers(int a, int b) {
        System.out.printf("a = %d, b = %d %n", a, b);
        a += b;
        b = a - b;
        a -= b;

        System.out.printf("a = %d, b = %d %n", a, b);
    }
}
