/*
 This program demonstrates the use of static variables, static methods,
 final variables, arrays of objects, constructors, and the instanceof
 operator in Java. It stores student details, tracks the total number
 of students enrolled in a university, and displays each student’s data.
*/
package ObjectOrientedProgramming.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Student { // Defines the Student class

    static String universityName = "Standford University"; // Static variable shared by all students

    static int totalStudents = 0; // Static variable to track total students

    final int rollNumber; // Final variable for roll number

    String name; // Stores student name
    char grade; // Stores student grade

    Student(String name, int rollNumber, char grade) { // Constructor to initialize student details
        this.name = name; // Assigns student name
        this.rollNumber = rollNumber; // Assigns roll number
        this.grade = grade; // Assigns grade
        totalStudents++; // Increments total student count
    }

    static void displayTotalStudents() { // Static method to display total students
        System.out.println("\nTotal Students Enrolled: " + totalStudents); // Prints total students
    }

    static void processStudent(Object obj) { // Static method to process student object
        if (obj instanceof Student) { // Checks if object is an instance of Student
            Student s = (Student) obj; // Typecasts object to Student
            System.out.println("University: " + universityName); // Prints university name
            System.out.println("Name: " + s.name); // Prints student name
            System.out.println("Roll Number: " + s.rollNumber); // Prints roll number
            System.out.println("Grade: " + s.grade); // Prints student grade
        } else {
            System.out.println("Object is not an instance of Student"); // Handles invalid object
        }
    }
}

public class UniversityStudent { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter number of students: "); // Prompts user for number of students
        int n = sc.nextInt(); // Reads number of students

        Student[] students = new Student[n]; // Creates array to store Student objects

        for (int i = 0; i < n; i++) { // Loop to read details for each student

            System.out.println("\nEnter details for Student " + (i + 1)); // Displays student count
            sc.nextLine(); // Consumes leftover newline

            System.out.print("Enter Name: "); // Prompts for student name
            String name = sc.nextLine(); // Reads student name

            System.out.print("Enter Roll Number: "); // Prompts for roll number
            int roll = sc.nextInt(); // Reads roll number

            System.out.print("Enter Grade (A/B/C): "); // Prompts for grade
            char grade = sc.next().charAt(0); // Reads grade character

            students[i] = new Student(name, roll, grade); // Creates Student object
        }

        Student.displayTotalStudents(); // Displays total number of students enrolled

        for (Student s : students) { // Loops through student array
            Student.processStudent(s); // Displays each student's details
        }
    }
}
