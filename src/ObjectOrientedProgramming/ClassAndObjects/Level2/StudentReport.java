/*
 This program generates a student report using classes and objects in Java.
 It defines a Student class to store student details such as name, roll number,
 and marks. The StudentReport class calculates the grade based on marks and
 displays the student information using user input.
*/
package CoreProgramming.ClassAndObjects.Level2; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Student { // Defines the Student class

    private String name; // Stores the student name
    private String rollNumber; // Stores the student roll number
    private float marks; // Stores the student marks

    public Student(String name, String rollNumber, float marks) { // Constructor to initialize student details
        this.name = name; // Assigns student name
        this.rollNumber = rollNumber; // Assigns roll number
        this.marks = marks; // Assigns marks
    }

    public String getName() { // Getter method to access student name
        return name; // Returns student name
    }

    public String getRollNumber() { // Getter method to access roll number
        return rollNumber; // Returns roll number
    }

    public float getMarks() { // Getter method to access student marks
        return marks; // Returns student marks
    }

    public void setMarks(float marks) { // Setter method to update student marks
        this.marks = marks; // Updates marks
    }

    public void setRollNumber(String rollNumber) { // Setter method to update roll number
        this.rollNumber = rollNumber; // Updates roll number
    }

    public void setName(String name) { // Setter method to update student name
        this.name = name; // Updates student name
    }
}

public class StudentReport { // Defines the main class

    public static void studentMarks(Student student) { // Method to calculate and display student grade
        float marks = student.getMarks(); // Retrieves marks using getter

        if (marks > 90 && marks <= 100) { // Checks for grade O
            System.out.println("Student grade: O"); // Prints grade O
        } else if (marks > 80 && marks <= 90) { // Checks for grade A+
            System.out.println("Student grade: A+"); // Prints grade A+
        } else if (marks > 70 && marks <= 80) { // Checks for grade A
            System.out.println("Student grade: A"); // Prints grade A
        } else if (marks > 60 && marks <= 70) { // Checks for grade B+
            System.out.println("Student grade: B+"); // Prints grade B+
        } else if (marks > 50 && marks <= 60) { // Checks for grade B
            System.out.println("Student grade: B"); // Prints grade B
        } else if (marks > 40 && marks <= 50) { // Checks for grade C
            System.out.println("Student grade: C"); // Prints grade C
        } else if (marks >= 0 && marks <= 40) { // Checks for fail
            System.out.println("Student grade: Fail"); // Prints Fail
        } else {
            System.out.println("Invalid marks"); // Handles invalid marks
        }
    }

    public static void studentDisplay(Student student) { // Method to display student details
        System.out.println("Student Name: " + student.getName()); // Prints student name
        System.out.println("Student Roll Number: " + student.getRollNumber()); // Prints roll number
        System.out.println("Student Marks: " + student.getMarks()); // Prints marks
    }

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter Student Name: "); // Prompts user to enter student name
        String name = input.nextLine(); // Reads student name

        System.out.print("Enter Student Roll Number: "); // Prompts user to enter roll number
        String rollNumber = input.nextLine(); // Reads roll number

        System.out.print("Enter Student Marks: "); // Prompts user to enter marks
        float marks = input.nextFloat(); // Reads student marks

        Student student = new Student(name, rollNumber, marks); // Creates Student object
        studentMarks(student); // Calculates and displays student grade
        studentDisplay(student); // Displays student details
    }
}
