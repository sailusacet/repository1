package com.package9;

import java.sql.*;

public class StatementVsPreparedStatementExample {
    // JDBC URL, username, and password of MySQL server
    
    public static void main(String[] args) {
        try (Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system")) {

            // Drop and create table for this example
            dropAndCreateTable(connection);

            // Insert data using Statement
            insertDataUsingStatement(connection);

            // Insert data using PreparedStatement
            insertDataUsingPreparedStatement(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to drop and create a sample table 'students'
    private static void dropAndCreateTable(Connection connection) throws SQLException {
        // Drop table if exists
        String dropTableSQL = "DROP TABLE IF EXISTS students";
        Statement statement = connection.createStatement();
        statement.executeUpdate(dropTableSQL);

        // Create table
        String createTableSQL = "CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(100), age INT)";
        statement.executeUpdate(createTableSQL);
    }

    // Method to insert data using Statement
    private static void insertDataUsingStatement(Connection connection) throws SQLException {
        // Create a statement object
        Statement statement = connection.createStatement();

        // Insert data using Statement
        String sql = "INSERT INTO students (id, name, age) VALUES (1, 'Alice', 20)";
        int rowsAffected = statement.executeUpdate(sql);

        // Check if insertion was successful
        if (rowsAffected > 0) {
            System.out.println("Data inserted using Statement.");
        } else {
            System.out.println("Failed to insert data using Statement.");
        }
    }

    // Method to insert data using PreparedStatement
    private static void insertDataUsingPreparedStatement(Connection connection) throws SQLException {
        // Prepare SQL query with parameters (parameterized query)
        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // Set values for parameters
        preparedStatement.setInt(1, 2); // ID
        preparedStatement.setString(2, "Bob"); // Name
        preparedStatement.setInt(3, 22); // Age

        // Execute the PreparedStatement
        int rowsAffected = preparedStatement.executeUpdate();

        // Check if insertion was successful
        if (rowsAffected > 0) {
            System.out.println("Data inserted using PreparedStatement.");
        } else {
            System.out.println("Failed to insert data using PreparedStatement.");
        }
    }
}

