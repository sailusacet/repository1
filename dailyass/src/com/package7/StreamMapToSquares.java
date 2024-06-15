package com.package7;

import java.util.Arrays;
import java.util.List;

public class StreamMapToSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Mapping integers to their squares and printing the results
        numbers.stream()
               .map(x -> x * x)
               .forEach(System.out::println);
    }
}

