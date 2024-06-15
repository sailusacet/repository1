package com.assesment1;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDb {
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
    }

    public void createStudent(Student student) throws SQLException {
        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, student.getStid());
            pstmt.setString(2, student.getStname());
            pstmt.setInt(3, student.getStage());
            pstmt.executeUpdate();
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                students.add(new Student(id, name, age));
            }
        }
        return students;
    }

    public Student getStudentById(int id) throws SQLException {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    return new Student(id, name, age);
                }
            }
        }
        return null;
    }

    public void updateStudent(Student student) throws SQLException {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getStname());
            pstmt.setInt(2, student.getStage());
            pstmt.setInt(3, student.getStid());
            pstmt.executeUpdate();
        }
    }

    public void deleteStudent(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
    
        public static void main(String[] args) {
            StudentDb studentDb = new StudentDb();

            try {
                // Create a new student
                Student s1 = new Student(1, "John Doe", 20);
                studentDb.createStudent(s1);
                Student s2 = new Student(2, "raju", 23);
                studentDb.createStudent(s2);
                Student s3 = new Student(3, "ajay", 24);
                studentDb.createStudent(s3);

                // Read all students
                List<Student> students = studentDb.getAllStudents();
                students.forEach(student -> System.out.println(student.getStname()));

                // Find a student by ID
                Student student = studentDb.getStudentById(1);
                if (student != null) {
                    System.out.println("Found student: " + student.getStname());
                }

                // Update a student's details
                student.setStname("John Smith");
                student.setStage(21);
                studentDb.updateStudent(student);

                // Delete a student by ID
                studentDb.deleteStudent(1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
