package com.package5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Please enter a valid integer.");
            scanner.next(); // Consume the invalid input to prevent infinite loop
        } finally {
            scanner.close();
            System.out.println("Finally block executed.");
        }
    }
}

