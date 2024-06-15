package com.package5;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        // Create an ArrayList with mixed data types
        ArrayList<Object> list = new ArrayList<>();

        // Adding elements to the list
        list.add(10); // Integer
        list.add("Hello"); // String
        list.add(3.14); // Double
        list.add('A'); // Character

        // Printing elements of the list
        System.out.println("Elements in the ArrayList:");
        for (Object element : list) {
            System.out.println(element);
        }
    }
}

