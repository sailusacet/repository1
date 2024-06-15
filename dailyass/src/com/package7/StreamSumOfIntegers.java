package com.package7;

import java.util.Arrays;

public class StreamSumOfIntegers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Creating a stream from an array and calculating sum
        int sum = Arrays.stream(array)
                        .sum();

        System.out.println("Sum of all elements: " + sum);
    }
}

