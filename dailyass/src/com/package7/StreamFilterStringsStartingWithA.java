package com.package7;

import java.util.Arrays;
import java.util.List;

public class StreamFilterStringsStartingWithA {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Apricot", "Avocado");

        // Filtering strings starting with "A" and printing them
        strings.stream()
               .filter(s -> s.startsWith("A"))
               .forEach(System.out::println);
    }
}

