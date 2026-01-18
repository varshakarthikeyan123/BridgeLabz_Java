/*
 This program checks the voting eligibility of students.
 It uses a non-static method to determine whether each student
 can vote based on their age and processes ages of 10 students
 using an array and loops.
*/
package CoreProgramming.JavaMethods.Level2;
// Package declaration indicating Java Methods Level 2 programs

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class StudentVoteChecker {
    // Class to check whether students are eligible to vote

    // Method to check whether a student is eligible to vote based on age
    public boolean canStudentVote(int age) {

        // If age is negative, it is invalid
        if (age < 0) {
            return false;
            // Returning false for invalid age
        }

        return age >= 18;
        // Returning true if age is 18 or above, otherwise false
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to take input from the user

        StudentVoteChecker checker = new StudentVoteChecker();
        // Creating object of StudentVoteChecker to call non-static method

        int[] ages = new int[10];
        // Declaring an array to store ages of 10 students

        for (int i = 0; i < ages.length; i++) {
            // Loop to read age for each student

            System.out.print("Enter age of student " + (i + 1) + ": ");
            // Prompting user to enter age

            ages[i] = input.nextInt();
            // Storing entered age in the array

            boolean canVote = checker.canStudentVote(ages[i]);
            // Calling method to check voting eligibility

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
                // Printing message if student is eligible to vote
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
                // Printing message if student is not eligible to vote
            }
        }

        input.close();
        // Closing Scanner to free system resources
    }
}
