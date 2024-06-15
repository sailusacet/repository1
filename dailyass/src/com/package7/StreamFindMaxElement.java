package com.package7;

import java.util.Arrays;
import java.util.List;

public class StreamFindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 8, 5);

        // Finding maximum element and printing it
        Integer maxNumber = numbers.stream()
                                   .max(Integer::compare)
                                   .orElse(null);

        System.out.println("Maximum number: " + maxNumber);
    }
}

