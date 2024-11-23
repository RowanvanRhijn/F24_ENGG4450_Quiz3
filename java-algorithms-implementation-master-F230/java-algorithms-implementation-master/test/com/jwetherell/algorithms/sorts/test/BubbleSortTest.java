package com.jwetherell.algorithms.sorts.test;

import com.jwetherell.algorithms.sorts.BubbleSort;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private static final Random RANDOM = new Random();
    private static final int SIZE = 10000;

    private static Integer[] unsorted = null;
    private static Integer[] sorted = null;
    private static Integer[] reverse = null;

    static {
        unsorted = new Integer[SIZE];
        int i = 0;
        while (i < unsorted.length) {
            int j = RANDOM.nextInt(unsorted.length * 10);
            unsorted[i++] = j;
        }

        sorted = new Integer[SIZE];
        for (i = 0; i < sorted.length; i++)
            sorted[i] = i;

        reverse = new Integer[SIZE];
        for (i = (reverse.length - 1); i >= 0; i--)
            reverse[i] = (SIZE - 1) - i;
    }

    @org.junit.jupiter.api.Test
    void testBubbleSorts() {
        // Bubble sort
        Integer[] result = BubbleSort.sort(unsorted.clone());
        assertTrue("Bubble sort unsorted error. result="+print(result), check(result));
        result = BubbleSort.sort(sorted.clone());
        assertTrue("Bubble sort sorted error. result="+print(result), check(result));
        result = BubbleSort.sort(reverse.clone());
        assertTrue("Bubble sort reverse error. result="+print(result), check(result));
    }
}