/*
 This program demonstrates the use of classes and objects in Java.
 It defines an Employee class to store employee details such as
 name, ID, and salary using constructors, getters, and setters.
 The EmployeeDetails class takes user input, creates an Employee
 object, and displays the employee information.
*/
package CoreProgramming.ClassAndObjects.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take input from the user

class Employee { // Defines the Employee class

    String name; // Stores the employee name
    String id; // Stores the employee ID
    double salary; // Stores the employee salary

    public Employee(String name, String id, double salary) { // Constructor to initialize employee details
        this.name = name; // Assigns name to the instance variable
        this.id = id; // Assigns ID to the instance variable
        this.salary = salary; // Assigns salary to the instance variable
    }

    public String getName() { // Getter method to access employee name
        return this.name; // Returns the employee name
    }

    public String getId() { // Getter method to access employee ID
        return this.id; // Returns the employee ID
    }

    public double getSalary() { // Getter method to access employee salary
        return this.salary; // Returns the employee salary
    }

    public void setName(String name) { // Setter method to update employee name
        this.name = name; // Updates the employee name
    }

    public void setId(String id) { // Setter method to update employee ID
        this.id = id; // Updates the employee ID
    }

    public void setSalary(double salary) { // Setter method to update employee salary
        if (salary > 0) { // Validates that salary is positive
            this.salary = salary; // Updates the employee salary
        }
    }
}

public class EmployeeDetails { // Defines the main class

    public static void employeeDisplay(Employee employee) { // Method to display employee details
        System.out.println("Name: " + employee.getName()); // Prints employee name
        System.out.println("ID: " + employee.getId()); // Prints employee ID
        System.out.println("Salary: " + employee.getSalary()); // Prints employee salary
    }

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter Employee name: "); // Prompts user to enter employee name
        String name = input.nextLine(); // Reads employee name

        System.out.print("Enter Employee ID: "); // Prompts user to enter employee ID
        String id = input.nextLine(); // Reads employee ID

        System.out.print("Enter Employee salary: "); // Prompts user to enter employee salary
        double salary = input.nextDouble(); // Reads employee salary

        Employee employee = new Employee(name, id, salary); // Creates Employee object using input values
        employeeDisplay(employee); // Calls method to display employee details
    }
}
