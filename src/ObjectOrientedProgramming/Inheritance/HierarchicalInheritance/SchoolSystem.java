/*
 This program demonstrates hierarchical inheritance in Java.
 It defines a base Person class and derived classes Teacher, Student,
 and Staff. Based on user input, the appropriate role object is created
 and its role-specific details are displayed.
*/
package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Person { // Base class representing a person

    String name; // Stores the person's name
    int age; // Stores the person's age

    Person(String name, int age) { // Constructor to initialize person details
        this.name = name; // Assigns name to instance variable
        this.age = age; // Assigns age to instance variable
    }
}

class Teacher extends Person { // Teacher class inherits from Person

    String subject; // Stores subject taught by teacher

    Teacher(String name, int age, String subject) { // Constructor for Teacher
        super(name, age); // Calls parent class constructor
        this.subject = subject; // Assigns subject
    }

    void displayRole() { // Displays teacher role details
        System.out.println("Role: Teacher"); // Prints role
        System.out.println("Subject: " + subject); // Prints subject
    }
}

class Student extends Person { // Student class inherits from Person

    String grade; // Stores student grade

    Student(String name, int age, String grade) { // Constructor for Student
        super(name, age); // Calls parent class constructor
        this.grade = grade; // Assigns grade
    }

    void displayRole() { // Displays student role details
        System.out.println("Role: Student"); // Prints role
        System.out.println("Grade: " + grade); // Prints grade
    }
}

class Staff extends Person { // Staff class inherits from Person

    String department; // Stores staff department

    Staff(String name, int age, String department) { // Constructor for Staff
        super(name, age); // Calls parent class constructor
        this.department = department; // Assigns department
    }

    void displayRole() { // Displays staff role details
        System.out.println("Role: Staff"); // Prints role
        System.out.println("Department: " + department); // Prints department
    }
}

public class SchoolSystem { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Name: "); // Prompts user to enter name
        String name = sc.nextLine(); // Reads name

        System.out.print("Enter Age: "); // Prompts user to enter age
        int age = sc.nextInt(); // Reads age
        sc.nextLine(); // Consumes leftover newline

        System.out.println("\nSelect Role:"); // Displays role options
        System.out.println("1. Teacher"); // Option for Teacher
        System.out.println("2. Student"); // Option for Student
        System.out.println("3. Staff"); // Option for Staff
        System.out.print("Enter choice: "); // Prompts user choice
        int choice = sc.nextInt(); // Reads user choice
        sc.nextLine(); // Consumes leftover newline

        switch (choice) { // Switch case to create role object
            case 1:
                System.out.print("Enter Subject: "); // Prompts subject
                String subject = sc.nextLine(); // Reads subject
                Teacher teacher = new Teacher(name, age, subject); // Creates Teacher object
                teacher.displayRole(); // Displays teacher details
                break;

            case 2:
                System.out.print("Enter Grade: "); // Prompts grade
                String grade = sc.nextLine(); // Reads grade
                Student student = new Student(name, age, grade); // Creates Student object
                student.displayRole(); // Displays student details
                break;

            case 3:
                System.out.print("Enter Department: "); // Prompts department
                String dept = sc.nextLine(); // Reads department
                Staff staff = new Staff(name, age, dept); // Creates Staff object
                staff.displayRole(); // Displays staff details
                break;

            default:
                System.out.println("Invalid choice"); // Handles invalid input
        }
    }
}
