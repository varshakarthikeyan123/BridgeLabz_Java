/*
 This program demonstrates the use of static variables, static methods,
 final variables, and the instanceof operator in Java.
 It defines an Employee class where the company name is shared,
 the total number of employees is tracked, and each employee has
 a final ID. The main class creates an employee and displays details.
*/
package ObjectOrientedProgramming.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Employee { // Defines the Employee class

    static String companyName = "HiAnime"; // Static variable shared by all employees
    String name; // Stores employee name
    final int id; // Final variable for employee ID
    String designation; // Stores employee designation
    private static int totalEmployees = 0; // Static variable to track total employees

    Employee(String name, String designation, int id) { // Constructor to initialize employee details
        this.name = name; // Assigns employee name
        this.designation = designation; // Assigns employee designation
        this.id = id; // Assigns employee ID
        totalEmployees++; // Increments total employee count
    }

    static void displayTotalEmployees() { // Static method to display total employees
        System.out.println("Total Employees: " + totalEmployees); // Prints total employee count
    }

    public void display() { // Method to display employee details
        System.out.println("Company Name: " + companyName); // Prints company name
        System.out.println("Name: " + name); // Prints employee name
        System.out.println("Designation: " + designation); // Prints employee designation
        System.out.println("ID: " + id); // Prints employee ID
    }
}

public class EmployeeManagement { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Employee Name: "); // Prompts user to enter employee name
        String name = sc.nextLine(); // Reads employee name

        System.out.print("Enter Employee Designation: "); // Prompts user to enter designation
        String designation = sc.nextLine(); // Reads employee designation

        Employee employee = new Employee(name, designation, 12345); // Creates Employee object with fixed ID

        if (employee instanceof Employee) { // Checks if object is an instance of Employee
            employee.display(); // Displays employee details
            Employee.displayTotalEmployees(); // Displays total number of employees
        }
    }
}
