package com.package8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {
    // JDBC URL, username, and password of MySQL server
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Prompting user for student details
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        
        // Establishing connection
        try (Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system")) {

            // Creating statement
            Statement statement = connection.createStatement();

            // SQL query to insert a new record into students table
            String sql = "INSERT INTO student (id, name) VALUES (" + id + ", '" + name + ")";

            // Executing query
            int rowsAffected = statement.executeUpdate(sql);

            if (rowsAffected > 0) {
                System.out.println("Student inserted successfully.");
            } else {
                System.out.println("Failed to insert student.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

