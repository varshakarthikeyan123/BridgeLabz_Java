/*
 This program calculates the power of a given number using a while loop.
 It takes a base number and an exponent from the user
 and computes the result by repeated multiplication.
*/
package CoreProgramming.controlflowpractices.level2;
// Package declaration for control flow practice programs (Level 2)

import java.util.Scanner;
// Scanner class is used to take input from the user

public class PowerWhile {
    // Main class where the program execution starts

    public static void main(String[] args) {
        // Main method

        Scanner scan = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting the user to enter the base number
        int number = scan.nextInt();
        // Reading the base number

        System.out.print("Enter a power: ");
        // Prompting the user to enter the exponent value
        int power = scan.nextInt();
        // Reading the power value

        // Loop to ensure the base number is positive
        while (number < 0) {
            System.out.print("Enter a positive number: ");
            // Asking the user again for a valid positive number
            number = scan.nextInt();
            // Reading the corrected base number
        }

        int result = 1;
        // Variable to store the final power result
        // Initialized to 1 as it is the identity value for multiplication

        int counter = 0;
        // Counter variable to track how many times multiplication is done

        // While loop to calculate number raised to the given power
        while (counter < power) {
            result = number * result;
            // Multiplying the base number with result
            counter++;
            // Incrementing the counter after each multiplication
        }

        System.out.println(result);
        // Displaying the calculated power result
    }
}
