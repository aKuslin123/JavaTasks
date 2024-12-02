package com.example.javatasks.expressInterviewTasks.hw.hw3_dataStructures;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] numbers = {1, 2, 3, 4};
        int result = sumArray(numbers);
        System.out.println(result);

        System.out.println("Задача 2");
        String original1 = "Привет";
        String reversed1 = reverseStringBuilder(original1);
        System.out.println(reversed1);

        String original2 = "Пока";
        String reversed2 = reverseStringFor(original2);
        System.out.println(reversed2);

        System.out.println("Задача 3");
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Исходный список: " + nums);
        removeEvenNumbers(nums);
        System.out.println("Список после удаления четных: " + nums);

        System.out.println("Задача 4");
        String test1 = "([]{})";
        String test2 = "([)]";
        String test3 = "((()))";
        String test4 = "(()";

        System.out.println(test1 + " - " + isValidBracketSequence(test1)); // true
        System.out.println(test2 + " - " + isValidBracketSequence(test2)); // false
        System.out.println(test3 + " - " + isValidBracketSequence(test3)); // true
        System.out.println(test4 + " - " + isValidBracketSequence(test4)); // false

        System.out.println("Задача 5");
        int[] array = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Исходный массив:");
        printArray(array);

        rotateArrayRight(array, n);

        System.out.println("После ротации на " + n + " позиции вправо:");
        printArray(array);
    }

    /*
    Задача 1: Массивы (Arrays)
    Написать метод, который принимает массив целых чисел
    и возвращает сумму всех элементов массива.
     */
    public static int sumArray(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }

    /*
    Задача 2: Строки (Strings)
    Создать функцию, которая принимает
    строку и возвращает её в обратном порядке.
     */
    public static String reverseStringBuilder(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static String reverseStringFor(String str) {
        char[] chars = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        return reversed.toString();
    }

    /*
    Задача 3: Списки (Lists)
    Разработать метод, который принимает
    список целых чисел и удаляет из него все четные числа.
     */
    public static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(num -> num % 2 == 0);
    }

    /*
    Задача 4: Стеки (Stacks)
    Написать функцию, использующую стек для проверки правильности
    последовательности скобок в строке (например, "([]{})" является правильной, а "([)]" — нет).
     */
    public static boolean isValidBracketSequence(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Если открывающая скобка, добавляем её в стек
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Если закрывающая скобка, проверяем верхний элемент стека
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Если стек пуст, а скобка закрывающая, последовательность неправильная
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Если пары не совпадают
                }
            }
        }

        // В конце стек должен быть пуст, иначе последовательность неправильная
        return stack.isEmpty();
    }

    // Метод для проверки совпадения пар скобок
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    /*
    Задача 5: Очереди (Queues)
    Разработать метод, который использует очередь для ротации
    элементов массива вправо на n позиций.
     */
    public static void rotateArrayRight(int[] array, int n) {
        if (array == null || array.length == 0 || n <= 0) {
            return; // Ничего не делаем для пустых массивов или некорректного n
        }

        int length = array.length;
        n = n % length; // Если n больше длины массива, берём остаток от деления
        Queue<Integer> queue = new LinkedList<>();

        // Добавляем последние n элементов в очередь
        for (int i = length - n; i < length; i++) {
            queue.offer(array[i]);
        }

        // Перемещаем оставшиеся элементы массива в очередь
        for (int i = 0; i < length - n; i++) {
            queue.offer(array[i]);
        }

        // Переносим элементы из очереди обратно в массив
        for (int i = 0; i < length; i++) {
            array[i] = queue.poll();
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
