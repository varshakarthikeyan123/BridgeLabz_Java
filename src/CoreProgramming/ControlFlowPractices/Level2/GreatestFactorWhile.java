/*
 This program finds the greatest factor of a given number
 excluding the number itself using a while loop.
 It starts checking from (number - 1) down to 1
 and stops as soon as the largest factor is found.
*/
package CoreProgramming.ControlFlowPractices.Level2;
// Package declaration for Level 2 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class GreatestFactorWhile {
    // Main class definition

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting user to enter a number
        int number = input.nextInt();
        // Reading the number for which the greatest factor is to be found

        int greatestFactor = 1;
        // Initializing greatest factor as 1
        // 1 is a factor of every integer

        int counter = number - 1;
        // Initializing counter to start checking from one less than the number

        // Loop runs from (number - 1) down to 1
        while (counter >= 1) {

            // Checking if the current counter value divides the number exactly
            if (number % counter == 0) {
                greatestFactor = counter;
                // Storing the greatest factor found
                break;
                // Breaking the loop since the largest factor is found
            }

            counter--;
            // Decrementing counter to check the next smaller number
        }

        System.out.println("Greatest factor: " + greatestFactor);
        // Displaying the greatest factor of the number
    }
}
