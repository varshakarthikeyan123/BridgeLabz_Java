/*
 This program checks the voting eligibility of students.
 It takes the ages of 10 students as input, displays the ages,
 and then checks whether each student can vote based on age.
*/
package CoreProgramming.ArrayPractice.Level1; // Defines the package for array practice programs (Level 1)

import java.util.Scanner; // Scanner is used to take input from the user

public class StudentVote { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        int[] age = new int[10]; // Declaring an integer array to store ages of 10 students

        System.out.print("Enter age of 10 students: "); // Prompts user to enter ages

        // Loop to read ages of 10 students
        for (int i = 0; i < 10; i++) { // Iterates 10 times
            age[i] = input.nextInt(); // Stores each age in the array
        }

        // Loop to display the entered ages
        for (int i = 0; i < 10; i++) { // Iterates through the array
            System.out.println(age[i] + " "); // Prints each student's age
        }

        // Loop to check voting eligibility for each student
        for (int i = 0; i < 10; i++) { // Iterates through the age array

            if (age[i] < 0) { // Checks if age is negative
                System.out.println("The number entered is negative."); // Prints error message
            }
            else if (age[i] >= 18) { // Checks if age is 18 or above
                System.out.println("The student with age " + age[i] + " can vote."); // Eligible to vote
            }
            else { // Executes if age is below 18
                System.out.println("The student with age " + age[i] + " cannot vote."); // Not eligible to vote
            }
        }
    }
}
