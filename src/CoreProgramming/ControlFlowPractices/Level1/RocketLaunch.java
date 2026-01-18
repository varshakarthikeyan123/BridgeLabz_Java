/*
 This program performs a rocket countdown.
 It takes a number from the user and counts down to 1,
 then prints a launch message.
*/
package CoreProgramming.ControlFlowPractices.Level1;
// Package declaration

import java.util.Scanner;
// Scanner class is used to take input from the user

public class RocketLaunch {
    // Main class
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        // Asking user for starting number

        int number = input.nextInt();
        // Reading the starting number for the countdown

        // Loop to ensure the entered number is valid (>= 1)
        while (number < 1) {
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
            // Re-taking input until valid
        }

        // for loop to perform countdown
        for (int i = number; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            // Printing countdown number
        }

        System.out.println("Launch the rocket");
        // Final launch message
    }
}
