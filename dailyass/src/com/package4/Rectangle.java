package com.package4;

//Rectangle.java (inside com.example.shapes package)



public class Rectangle {
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Method to calculate area
 public double calculateArea() {
     return length * width;
 }

 // Method to calculate perimeter
 public double calculatePerimeter() {
     return 2 * (length + width);
 }

 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(5.0, 3.0);
     System.out.println("Area: " + rectangle.calculateArea());
     System.out.println("Perimeter: " + rectangle.calculatePerimeter());
 }
}

