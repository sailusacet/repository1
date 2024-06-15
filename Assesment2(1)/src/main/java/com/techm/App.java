package com.techm;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeManager employeeManager = (EmployeeManager) context.getBean("employeeManager");

        // Create new employee
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setDepartment("Engineering");
        employeeManager.addEmployee(employee);

        // Get all employees
        List<Employee> employees = employeeManager.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getDepartment());
        }

        // Get employee by id
        Employee emp = employeeManager.getEmployeeById(1);
        if (emp != null) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getDepartment());
        }

        // Update employee
        emp.setName("Jane Doe");
        emp.setDepartment("Marketing");
        employeeManager.updateEmployee(emp);

        // Delete employee
        employeeManager.deleteEmployee(1);
    }
}

