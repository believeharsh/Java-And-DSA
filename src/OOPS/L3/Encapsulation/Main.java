package OOPS.L3.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(1, "Harsh Dahiya" ,  78000);
        // Employee emp2 = new Employee(2, "Nishi Dahiya", 90000);

        // Accessing and modifying data using getters and setters
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        // Updating data using setters
        emp.setSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());

        // Invalid update
        emp.setSalary(-1000); // Output: Salary must be positive!
    }
}