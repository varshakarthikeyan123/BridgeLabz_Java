/*
 This program calculates the factorial of a given number.
 It validates user input to ensure the number is positive and non-zero,
 then uses a while loop to compute the factorial value.
*/
package CoreProgramming.controlflowpractices.level1; // Package for Level 1 control flow practice programs

import java.util.Scanner; // Imports Scanner class to take input from the user

public class Factorial { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter a number: "); // Prompts the user to enter a number
        int number = input.nextInt(); // Reads the number entered by the user

        // Loop to ensure the number is positive and non-zero
        while (number <= 0) { // Checks if the number is invalid
            System.out.print("Enter a positive non-zero number: "); // Asks again for valid input
            number = input.nextInt(); // Reads the new number
        }

        int factorial = 1; // Initializes factorial result to 1

        int i = 1; // Initializes loop counter starting from 1

        // Loop to calculate factorial using multiplication
        while (i <= number) { // Runs loop until i reaches the given number
            factorial = factorial * i; // Multiplies factorial with current value of i
            i++; // Increments i by 1
        }

        System.out.println(factorial); // Prints the final factorial result
    }
}
