/*
 This program checks whether a given integer is positive, negative, or zero.
 It uses conditional statements (if–else if–else) to compare the input value
 and prints the corresponding result.
*/
package coreprogramming.controlflowpractices.level1; // Defines the package for control flow practice programs

import java.util.Scanner; // Imports Scanner class to take input from the user

public class Integers { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        System.out.print("Enter a number: "); // Prompting the user to enter a number
        int number = input.nextInt(); // Reading an integer value from the user

        // Checking whether the number is positive, negative, or zero
        if (number > 0) { // Condition to check if the number is greater than zero
            System.out.println("Positive."); // Prints when the number is positive
        }
        else if (number < 0) { // Condition to check if the number is less than zero
            System.out.println("Negative."); // Prints when the number is negative
        }
        else { // Executes when the number is neither positive nor negative
            System.out.println("Zero."); // Prints when the number is zero
        }
    }
}
