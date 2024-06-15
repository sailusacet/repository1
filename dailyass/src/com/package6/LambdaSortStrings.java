package com.package6;

import java.util.Arrays;
import java.util.Collections;

public class LambdaSortStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "orange", "banana", "grape", "kiwi"};

        // Sorting array of strings in descending order using lambda expression
        Arrays.sort(strings, (s1, s2) -> s2.compareTo(s1));

        // Printing sorted array
        System.out.println("Sorted strings in descending order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

