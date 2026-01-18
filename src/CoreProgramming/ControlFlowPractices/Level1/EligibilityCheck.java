/*
 This program checks whether a person is eligible to vote.
 It validates the entered age and then determines eligibility
 based on the voting age criteria.
*/
package CoreProgramming.ControlFlowPractices.Level1; // Package for Level 1 control flow programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class EligibilityCheck { // Main class
    public static void main(String[] args) { // Entry point of the program

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter age: ");
        int age = input.nextInt();
        // Reading the age of the person

        // Loop to ensure the entered age is valid (greater than 0)
        while (age <= 0) {
            System.out.print("Please enter a valid age: ");
            age = input.nextInt();
            // Asking again until a valid age is entered
        }

        // Checking voting eligibility based on age
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        }
        else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
