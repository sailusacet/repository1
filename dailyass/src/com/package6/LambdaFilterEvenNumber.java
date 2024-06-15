package com.package6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using lambda expression to filter even numbers
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .forEach(System.out::println);
    }
}

