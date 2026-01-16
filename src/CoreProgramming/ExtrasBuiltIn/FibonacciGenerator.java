package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FibonacciGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        // Reading how many Fibonacci terms to generate

        // Checking if the entered number of terms is valid
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            // Fibonacci sequence is defined only for positive number of terms
        }
        else {
            System.out.println("Fibonacci sequence up to " + terms + " terms:");
            printFibonacci(terms);
            // Calling method to print Fibonacci sequence
        }

        scanner.close();
        // Closing the scanner to release resources
    }

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int n) {

        int first = 0;
        // First Fibonacci number

        int second = 1;
        // Second Fibonacci number

        // Loop to generate Fibonacci numbers up to n terms
        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");
            // Printing the current Fibonacci number

            int next = first + second;
            // Calculating the next Fibonacci number

            first = second;
            // Shifting first to the next position

            second = next;
            // Shifting second to the next position
        }

        System.out.println();
        // Printing a new line after the sequence
    }
}
