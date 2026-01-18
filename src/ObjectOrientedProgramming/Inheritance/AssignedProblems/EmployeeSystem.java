/*
 This program demonstrates inheritance and method overriding in Java.
 It defines a base Employee class and derived classes Manager, Developer,
 and Intern. Based on user input, the appropriate employee object is
 created and the overridden displayDetails() method is executed.
*/
package ObjectOrientedProgramming.Inheritance.AssignedProblems; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

// Created an Employee class
class Employee { // Base class for all employee types

    String name; // Stores employee name
    int id; // Stores employee ID
    double salary; // Stores employee salary

    Employee(String name, int id, double salary) { // Constructor to initialize employee details
        this.name = name; // Assigns name to instance variable
        this.id = id; // Assigns ID to instance variable
        this.salary = salary; // Assigns salary to instance variable
    }

    // Created a method for displaying details
    void displayDetails() { // Method to display employee details
        System.out.println("Name   : " + name); // Prints employee name
        System.out.println("ID     : " + id); // Prints employee ID
        System.out.println("Salary : ₹" + salary); // Prints employee salary
    }
}

// Extending Manager class
class Manager extends Employee { // Manager inherits from Employee

    int teamSize; // Stores number of team members

    Manager(String name, int id, double salary, int teamSize) { // Constructor for Manager
        super(name, id, salary); // Calls parent class constructor
        this.teamSize = teamSize; // Assigns team size
    }

    // Method to display details
    void displayDetails() { // Overridden method to display Manager details
        super.displayDetails(); // Calls base class displayDetails()
        System.out.println("Role   : Manager"); // Prints role
        System.out.println("Team Size : " + teamSize); // Prints team size
    }
}

// Extending the Developer class
class Developer extends Employee { // Developer inherits from Employee

    String programmingLanguage; // Stores programming language

    Developer(String name, int id, double salary, String programmingLanguage) { // Constructor for Developer
        super(name, id, salary); // Calls parent class constructor
        this.programmingLanguage = programmingLanguage; // Assigns programming language
    }

    void displayDetails() { // Overridden method to display Developer details
        super.displayDetails(); // Calls base class displayDetails()
        System.out.println("Role   : Developer"); // Prints role
        System.out.println("Language : " + programmingLanguage); // Prints programming language
    }
}

// Extending Intern class
class Intern extends Employee { // Intern inherits from Employee

    int internshipDuration; // Stores internship duration in months

    Intern(String name, int id, double salary, int internshipDuration) { // Constructor for Intern
        super(name, id, salary); // Calls parent class constructor
        this.internshipDuration = internshipDuration; // Assigns internship duration
    }

    // Method to display details
    void displayDetails() { // Overridden method to display Intern details
        super.displayDetails(); // Calls base class displayDetails()
        System.out.println("Role   : Intern"); // Prints role
        System.out.println("Duration : " + internshipDuration + " months"); // Prints duration
    }
}

// Created a main class called EmployeeSystem
public class EmployeeSystem { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        // Getting user input
        System.out.println("Select Employee Type:"); // Displays menu
        System.out.println("1. Manager"); // Option for Manager
        System.out.println("2. Developer"); // Option for Developer
        System.out.println("3. Intern"); // Option for Intern
        System.out.print("Enter choice: "); // Prompts user choice
        int choice = sc.nextInt(); // Reads user choice
        sc.nextLine(); // Consumes leftover newline

        System.out.print("Enter Name: "); // Prompts employee name
        String name = sc.nextLine(); // Reads employee name

        System.out.print("Enter ID: "); // Prompts employee ID
        int id = sc.nextInt(); // Reads employee ID

        System.out.print("Enter Salary: "); // Prompts employee salary
        double salary = sc.nextDouble(); // Reads employee salary
        sc.nextLine(); // Consumes leftover newline

        Employee emp; // Declares Employee reference

        // Switch case to get choice
        switch (choice) {
            case 1:
                System.out.print("Enter Team Size: "); // Prompts team size
                int teamSize = sc.nextInt(); // Reads team size
                emp = new Manager(name, id, salary, teamSize); // Creates Manager object
                break;

            case 2:
                System.out.print("Enter Programming Language: "); // Prompts programming language
                String lang = sc.nextLine(); // Reads programming language
                emp = new Developer(name, id, salary, lang); // Creates Developer object
                break;

            case 3:
                System.out.print("Enter Internship Duration (months): "); // Prompts internship duration
                int duration = sc.nextInt(); // Reads duration
                emp = new Intern(name, id, salary, duration); // Creates Intern object
                break;

            default:
                System.out.println("Invalid choice"); // Handles invalid choice
                sc.close(); // Closes Scanner
                return; // Exits program
        }

        // Calling method
        emp.displayDetails(); // Calls overridden displayDetails() using polymorphism
    }
}
