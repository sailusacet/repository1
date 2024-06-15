package com.package4;

//Book.java

public class Book {
 private String title;
 private String author;
 private String isbn;

 // Parameterized constructor
 public Book(String title, String author, String isbn) {
     this.title = title;
     this.author = author;
     this.isbn = isbn;
 }

 public void display() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("ISBN: " + isbn);
 }

 public static void main(String[] args) {
     Book book = new Book("Java Programming", "John Doe", "1234567890");
     book.display();
 }
}

