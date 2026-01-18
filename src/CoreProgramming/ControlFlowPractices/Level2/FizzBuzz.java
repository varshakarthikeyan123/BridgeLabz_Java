/*
 This program implements a simple FizzBuzz check.
 It takes a number as input and checks whether it is
 divisible by 3, 5, or both.
 It also handles positive, negative, and zero values.
*/
package CoreProgramming.ControlFlowPractices.Level2;
// Package declaration for Level 2 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FizzBuzz {
    // Main class definition

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting the user to enter a number
        int number = input.nextInt();
        // Reading an integer value from the user

        // Checking if the number is positive
        if (number > 0) {

            // Checking if the number is divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
                // Printed when number is divisible by both 3 and 5
            }
            // Checking if the number is divisible only by 5
            else if (number % 5 == 0) {
                System.out.println("Buzz");
                // Printed when number is divisible by 5
            }
            // Checking if the number is divisible only by 3
            else if (number % 3 == 0) {
                System.out.println("FizzBuzz");
                // As per current logic, this also prints "FizzBuzz"
            }
            // If the number is positive but not divisible by 3 or 5
            else {
                System.out.println(number + " is positive.");
                // Printed when number is positive but not divisible by 3 or 5
            }
        }
        // Checking if the number is negative
        else if (number < 0) {
            System.out.println(number + " is negative.");
            // Printed when the number is negative
        }
        // This case occurs when the number is zero
        else {
            System.out.println(number + " is zero.");
            // Printed when the number is zero
        }
    }
}
