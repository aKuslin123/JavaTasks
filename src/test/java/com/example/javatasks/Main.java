package com.example.javatasks;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");
    }

//        String result = Tasks.intNumber(5);
//        System.out.println(result);
//
//        boolean result2 = Tasks.task2(5);
//        System.out.println(result2);
//
//        boolean result3 = Tasks.task3(9);
//        System.out.println(result3);
//
//        boolean result4 = Tasks.task4(25, 6);
//        System.out.println(result4);
//
//        boolean result5 = Tasks.task5(1235);
//        System.out.println(result5);
//
//        boolean result6 = Tasks.task6(1233);
//        System.out.println(result6);
//
//        boolean result7 = Tasks.task7(5, -5);
//        System.out.println(result7);
//
//        String result8 = Tasks.task8(0);
//        System.out.println(result8);

//        boolean result14 = Tasks1.task14int(123321);
//        System.out.println(result14);
}
