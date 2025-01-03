package com.example.javatasks.expressInterviewTasks.hw.hw4.sorter;

public class Task {
    public class Sorter {
        public void sort(int[] array, String algorithm) {
            if (algorithm.equals("bubble")) {
                // Реализация пузырьковой сортировки
                System.out.println("Sorting using bubble sort");
            } else if (algorithm.equals("merge")) {
                // Реализация сортировки слиянием
                System.out.println("Sorting using merge sort");
            } else if (algorithm.equals("quick")) {
                // Реализация быстрой сортировки
                System.out.println("Sorting using quick sort");
            } else {
                throw new IllegalArgumentException("Unsupported sorting algorithm: " + algorithm);
            }
        }
    }

}
