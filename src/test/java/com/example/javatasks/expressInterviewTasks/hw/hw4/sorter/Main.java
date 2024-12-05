package com.example.javatasks.expressInterviewTasks.hw.hw4.sorter;

import com.example.javatasks.expressInterviewTasks.hw.hw4.sorter.strategies.SortingStrategy;

public class Main {
    public static void main(String[] args) {
        SortingStrategy bubbleSortingStrategy = new SortingStrategyHandler().getSortingStrategy(SortingType.BUBLE);
        int[] sortedArray = bubbleSortingStrategy.sort(new int[]{1, 2, 5, 4, 3, 6});
    }
}
