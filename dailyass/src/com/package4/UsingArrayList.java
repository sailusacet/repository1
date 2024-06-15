package com.package4;

//UsingArrayList.java

import java.util.ArrayList;

public class UsingArrayList {
 public static void main(String[] args) {
     ArrayList<String> list = new ArrayList<>();

     // Adding elements to the list
     list.add("Java");
     list.add("Python");
     list.add("C++");

     // Retrieving elements from the list
     System.out.println("Elements in the list:");
     for (String element : list) {
         System.out.println(element);
     }
 }
}

