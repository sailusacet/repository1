package com.package5;


public class CustomExceptionExample {
 // Method to validate age and throw custom exception if age is less than 18
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above.");
     } else {
         System.out.println("Age validated successfully.");
     }
 }

 public static void main(String[] args) {
     try {
         // Validate age
         validateAge(20); // Change the age here to test different scenarios
     } catch (InvalidAgeException e) {
         System.out.println("InvalidAgeException caught: " + e.getMessage());
     }
 }
}

