/*
 This program generates and prints the Fibonacci sequence
 for a given number of terms entered by the user.
 It demonstrates:
 - User input using Scanner
 - Method calls
 - Loop-based Fibonacci logic
 - Basic input validation
*/
package CoreProgramming.extrasbuiltIn;
// Package declaration for extra built-in concept programs

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class FibonacciGenerator {
    // Class to generate Fibonacci sequence

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        // Reading number of Fibonacci terms to generate

        // Checking whether the entered number of terms is valid
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            // Fibonacci sequence requires a positive number of terms
        }
        else {
            System.out.println("Fibonacci sequence up to " + terms + " terms:");
            // Displaying header message

            printFibonacci(terms);
            // Calling method to print Fibonacci sequence
        }

        scanner.close();
        // Closing Scanner to release system resources
    }

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int n) {

        int first = 0;
        // Initializing first Fibonacci number

        int second = 1;
        // Initializing second Fibonacci number

        // Loop to generate Fibonacci numbers up to n terms
        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");
            // Printing the current Fibonacci number

            int next = first + second;
            // Calculating the next Fibonacci number

            first = second;
            // Shifting second number to first position

            second = next;
            // Assigning next number to second position
        }

        System.out.println();
        // Printing a new line after the sequence output
    }
}
