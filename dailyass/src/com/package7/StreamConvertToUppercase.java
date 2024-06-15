package com.package7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConvertToUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        // Converting strings to uppercase and collecting into a new list
        List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

        // Printing the converted uppercase strings
        System.out.println("Uppercase strings:");
        uppercaseStrings.forEach(System.out::println);
    }
}

