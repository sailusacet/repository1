package com.assesment1;


import java.util.ArrayList;
import java.util.List;

class StudentManager {
    private List<Student> studentList;

    // Constructor
    public StudentManager() {
        studentList = new ArrayList<>();
    }

    // Adds a new student to the collection
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Returns a list of all students
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentList);
    }

    // Returns a student by their id, or null if not found
    public Student getStudentById(int id) {
        for (Student student : studentList) {
            if (student.getStid() == id) {
                return student;
            }
        }
        return null;
    }

    // Updates the name and age of the student with the specified id
    public boolean updateStudent(int id, String name, int age) {
        for (Student student : studentList) {
            if (student.getStid() == id) {
                student.setStname(name);
                student.setStage(age);
                return true;
            }
        }
        return false;
    }

    // Removes the student with the specified id from the collection
    public boolean deleteStudent(int id) {
        for (Student student : studentList) {
            if (student.getStid() == id) {
                studentList.remove(student);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();

        // Adding students
        sm.addStudent(new Student(1,"sailaja",20));
    	sm.addStudent(new Student(2,"nagu",21));
    	sm.addStudent(new Student(3,"sudheshna",20));
    	sm.addStudent(new Student(4,"jyothi",22));
    	sm.addStudent(new Student(5,"fouzia",21));
    	sm.addStudent(new Student(6,"farheen",23));

        // Reading all students
        System.out.println("All Students: " + sm.getAllStudents());

        // Getting a student by id
        System.out.println("Student with ID 1: " +sm.getStudentById(1));

        // Updating a student
        sm.updateStudent(1, "sailu", 21);
        System.out.println("Updated Student with ID 1: " +sm.getStudentById(1));

        // Deleting a student
        sm.deleteStudent(6);
        System.out.println("All Students after deletion: " + sm.getAllStudents());
    }
}

