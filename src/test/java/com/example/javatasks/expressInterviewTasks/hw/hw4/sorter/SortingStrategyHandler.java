package com.example.javatasks.expressInterviewTasks.hw.hw4.sorter;

import com.example.javatasks.expressInterviewTasks.hw.hw4.sorter.strategies.BubbleSortingStrategy;
import com.example.javatasks.expressInterviewTasks.hw.hw4.sorter.strategies.MergeSortingStrategy;
import com.example.javatasks.expressInterviewTasks.hw.hw4.sorter.strategies.QuickSortingStrategy;
import com.example.javatasks.expressInterviewTasks.hw.hw4.sorter.strategies.SortingStrategy;

public class SortingStrategyHandler {
    public SortingStrategy getSortingStrategy(SortingType type) {
        return switch (type) {
            case BUBLE -> new BubbleSortingStrategy();
            case MERGE -> new MergeSortingStrategy();
            case QUICK -> new QuickSortingStrategy();
            default -> throw new IllegalArgumentException("Unknown sorting type");
        };
    }
}
