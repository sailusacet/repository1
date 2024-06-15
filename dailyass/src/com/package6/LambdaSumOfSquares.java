package com.package6;

import java.util.Arrays;

public class LambdaSumOfSquares {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Using lambda expression to calculate sum of squares
        int sumOfSquares = Arrays.stream(array)
                                 .map(x -> x * x)
                                 .sum();

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}

