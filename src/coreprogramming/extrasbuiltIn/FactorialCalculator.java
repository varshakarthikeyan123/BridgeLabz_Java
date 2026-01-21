/*
 This program calculates the factorial of a given non-negative integer.
 It uses:
 - A separate method to take and validate user input
 - A recursive method to calculate factorial
 - A display method to print the result
 The program demonstrates method calls, recursion, and basic input validation.
*/
package CoreProgramming.extrasbuiltIn;
// Package declaration for extra built-in concept programs

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class FactorialCalculator {
    // Class to calculate factorial using recursion and methods

    public static void main(String[] args) {
        // Main method where program execution begins

        int number = getInput();
        // Calling method to get a valid non-negative integer from the user

        long factorial = calculateFactorial(number);
        // Calling recursive method to calculate factorial of the number

        displayResult(number, factorial);
        // Calling method to display the final factorial result
    }

    // Method to get input from the user
    public static int getInput() {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a non-negative integer to calculate factorial: ");
        int num = scanner.nextInt();
        // Reading integer input from the user

        // Checking if the entered number is negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers. Exiting.");
            // Displaying error message for invalid input
            System.exit(0);
            // Terminating the program execution
        }

        return num;
        // Returning the valid non-negative number
    }

    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {

        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
            // Returning 1 for base case
        }
        else {
            // Recursive case: n! = n × (n − 1)!
            return n * calculateFactorial(n - 1);
            // Returning factorial value using recursion
        }
    }

    // Method to display the factorial result
    public static void displayResult(int num, long factorial) {

        System.out.println("Factorial of " + num + " is: " + factorial);
        // Printing the factorial result to the console
    }
}
