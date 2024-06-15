package com.package5;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and marks
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Adding student names and marks
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 75);
        studentMarks.put("David", 88);

        // Printing names and marks of all students
        System.out.println("Student names and their marks:");
        for (String name : studentMarks.keySet()) {
            System.out.println(name + " : " + studentMarks.get(name));
        }
    }
}

