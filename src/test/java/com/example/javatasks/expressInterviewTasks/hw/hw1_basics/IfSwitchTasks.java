package com.example.javatasks.expressInterviewTasks.hw.hw1_basics;

import com.example.javatasks.qaAuto.tasks2.Player;

import java.util.Scanner;

public class IfSwitchTasks {
    public static void main(String[] args) {
        //taskOne();
        //switchCalculator();
        //timeOfYear();
        //ageCheck();
        divideCheck();
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

    /*
    Задача 2: Калькулятор с использованием switch
    Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.
    Пример:
    makefile
    Copy code
    Введите первое число: 7
    Введите оператор: *
    Введите второе число: 3
    Результат: 21
     */
    public static void switchCalculator() {
        System.out.println("Введите первое число: ");
        int firstNum = sc.nextInt();
        System.out.println("Введите оператор: ");
        String operator = sc.next();
        System.out.println("Введите второе число: ");
        int secondNum = sc.nextInt();
        int result = 0;

        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            default:
                System.out.println("Такой оператор не поддерживается");
        }
        System.out.println(result);
    }

    /*
    Задача 3: Определение времени года
    Пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.
    Пример:
    makefile

    Введите номер месяца: 12
    Результат: Зима
     */
    public static void timeOfYear() {
        System.out.println("Введите номер месяца: ");
        int num = sc.nextInt();

        switch (num) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void timeOfYearJava11AndLess() {
        System.out.println("Введите номер месяца: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    /*
    Задача 4: Проверка возраста
    Напишите программу, которая определяет категорию человека по возрасту:
    0-12: Ребёнок
    13-17: Подросток
    18-64: Взрослый
    65+: Пенсионер.
    Используйте if-else.
    Пример:
    makefile

    Введите возраст: 30
    Результат: Взрослый
     */
    public static void ageCheck() {
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();

        if (age < 13) {
            System.out.println("Ребенок");
        } else if (age < 18) {
            System.out.println("Подросток");
        } else if (age < 65) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пенсионер");
        }
    }

    /*
    Задача 5: Проверка делимости
    Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.
    Пример:
    makefile

    Введите число: 15
    Результат: Делится на 3 и 5
     */
    public static void divideCheck() {
        System.out.println("Введите число");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("Число делится на 3 и 5 одновременно");
        } else {
            System.out.println("Число не делится на 3 и 5 одновременно");
        }
    }
}
