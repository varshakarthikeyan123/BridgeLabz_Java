/*
 This program calculates the factorial of a given number using a for loop.
 It first validates the input to ensure the number is positive and non-zero,
 then computes the factorial by multiplying numbers from 1 up to the given value.
*/
package coreprogramming.controlflowpractices.level1; // Package for Level 1 control flow practice programs

import java.util.Scanner; // Imports Scanner class to take input from the user

public class FactorialForLoop { // Main class definition
    public static void main(String[] args) { // Main method where program execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        System.out.print("Enter a number: "); // Prompting user to enter a number
        int number = input.nextInt(); // Reading the number entered by the user

        // Loop to ensure the number is positive and non-zero
        while (number <= 0) { // Checks if the number is invalid
            System.out.print("Enter a positive non-zero number: "); // Asking for valid input again
            number = input.nextInt(); // Reading the corrected number
        }

        int factorial = 1; // Variable to store factorial result, initialized to 1

        // for loop to calculate factorial
        for (int i = 1; i <= number; i++) { // Loop runs from 1 to the given number
            factorial *= i; // Multiplying factorial with the current value of i
        }

        System.out.println(factorial); // Displaying the final factorial result
    }
}
