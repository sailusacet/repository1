package com.package9;

import java.sql.*;
import java.util.Scanner;

public class DeleteOrder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for order id to delete
        System.out.print("Enter order ID to delete: ");
        int productId = scanner.nextInt();

        // Establishing connection
        try (Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system")) {

            // Creating statement
            Statement statement = connection.createStatement();

            // SQL query to delete a record from orders table
            String sql = "DELETE FROM orders WHERE id = " + productId;

            // Executing query
            int rowsAffected = statement.executeUpdate(sql);

            if (rowsAffected > 0) {
                System.out.println("Order deleted successfully.");
            } else {
                System.out.println("No order found with ID " +productId);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
