package com.package4;

//Person.java

public class Person {
 private String name;
 protected int age;
 String address; // Default access modifier

 // Getter for name
 public String getName() {
     return name;
 }

 // Setter for name
 public void setName(String name) {
     this.name = name;
 }

 public static void main(String[] args) {
     // Creating an object of a subclass in a different package to access age and address
     SubClass subClass = new SubClass();
     subClass.accessParentFields();
 }
}

//SubClass.java (in a different package)


