package com.package9;

import java.sql.*;
import java.util.Scanner;

public class UpdateStudent {
    // JDBC URL, username, and password of MySQL server
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for product id and new price
        System.out.print("Enter student ID to update: ");
        int Id = scanner.nextInt();

        System.out.print("Enter new name: ");
       String newname = scanner.next();

        // Establishing connection
        try (Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system")) {

            // Creating statement
            Statement statement = connection.createStatement();

            // SQL query to update price of a product in products table
            String sql = "UPDATE student SET stname = " + newname + " WHERE stid = " + Id;

            // Executing query
            int rowsAffected = statement.executeUpdate(sql);

            if (rowsAffected > 0) {
                System.out.println("student name updated successfully.");
            } else {
                System.out.println("No student found with ID " + Id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

