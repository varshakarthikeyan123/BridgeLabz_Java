package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check whether a student is eligible to vote based on age
    public boolean canStudentVote(int age) {

        // If age is negative, it is invalid, so return false
        if (age < 0) {
            return false;
        }

        // Return true if age is 18 or above, otherwise false
        return age >= 18;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Create an object of StudentVoteChecker to call non-static methods
        StudentVoteChecker checker = new StudentVoteChecker();

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to take input for each student
        for (int i = 0; i < ages.length; i++) {

            // Read age of the current student
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Check if the student can vote using the method
            boolean canVote = checker.canStudentVote(ages[i]);

            // Display result based on eligibility
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the Scanner to free resources
        input.close();
    }
}
