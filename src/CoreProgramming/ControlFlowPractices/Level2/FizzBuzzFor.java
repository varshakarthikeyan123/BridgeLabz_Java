/*
 This program prints the FizzBuzz sequence from 1 up to a given number.
 It uses a while loop to iterate through numbers.
 For each number:
 - Prints "FizzBuzz" if divisible by both 3 and 5
 - Prints "Fizz" if divisible only by 3
 - Prints "Buzz" if divisible only by 5
 - Prints the number itself otherwise
*/
package CoreProgramming.ControlFlowPractices.Level2;
// Package declaration for Level 2 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FizzBuzzFor {
    // Main class definition

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting user to enter a number
        int number = input.nextInt();
        // Reading the number up to which FizzBuzz should be printed

        int i = 1;
        // Initializing counter variable starting from 1

        // Loop runs from 1 to the entered number
        while (i <= number) {

            // Checking if the current number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                // Printed when number is divisible by both 3 and 5
            }
            // Checking if the current number is divisible only by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
                // Printed when number is divisible by 3
            }
            // Checking if the current number is divisible only by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
                // Printed when number is divisible by 5
            }
            // If the number is not divisible by 3 or 5
            else {
                System.out.println(i);
                // Printing the number itself
            }

            i++;
            // Incrementing counter to move to the next number
        }
    }
}
