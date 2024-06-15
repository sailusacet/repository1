package com.package7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamCalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers separated by space: ");
        String input = scanner.nextLine();

        // Split input string into array of integers
        String[] parts = input.split("\\s+");
        Integer[] numbers = new Integer[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        // Creating a list from array
        List<Integer> list = Arrays.asList(numbers);

        // Calculating average using stream
        double average = list.stream()
                             .mapToInt(Integer::intValue)
                             .average()
                             .orElse(0.0);

        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}

