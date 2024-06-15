package com.package4;

//Student.java

public class Student {
 private String name;
 private int age;

 // Default constructor
 public Student() {
     this.name = "Unknown";
     this.age = 0;
 }

 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }

 public static void main(String[] args) {
     Student student = new Student();
     student.display();
 }
}

