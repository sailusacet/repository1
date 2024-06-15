package com.package6;

import java.util.Arrays;
import java.util.List;

public class LambdaFindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 8, 5);

        // Using lambda expression to find maximum element
        Integer maxNumber = numbers.stream()
                                   .max(Integer::compare)
                                   .orElse(null);

        System.out.println("Maximum number: " + maxNumber);
    }
}

