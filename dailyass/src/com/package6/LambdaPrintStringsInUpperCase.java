package com.package6;

import java.util.Arrays;
import java.util.List;

public class LambdaPrintStringsInUpperCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        // Using lambda expression to print strings in uppercase
        strings.forEach(str -> System.out.println(str.toUpperCase()));
    }
}

