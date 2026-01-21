/*
 This program checks whether a given number is an Abundant Number.
 An abundant number is a number for which the sum of its proper divisors
 (excluding the number itself) is greater than the number.
*/
package CoreProgramming.controlflowpractices.level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class AbundantNumber {
    // Main class definition

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting the user to enter a number
        int N = input.nextInt();
        // Reading the number from the user

        int original = N;
        // Storing the original number for final comparison

        // Loop to ensure the entered number is positive
        while (N < 0) {
            System.out.print("Enter a positive integer: ");
            // Asking the user again for a valid positive number
            N = input.nextInt();
            // Reading the corrected input
            original = N;
            // Updating original value after validation
        }

        int sum = 0;
        // Variable to store the sum of proper divisors

        // Loop to find all proper divisors of the number
        // Proper divisors are numbers less than N that divide N exactly
        for (int i = 1; i < N; i++) {
            // Loop runs from 1 to N-1
            if (N % i == 0) {
                // Checking if i is a divisor of N
                sum += i;
                // Adding the divisor to the sum
            }
        }

        System.out.println("Sum of divisors: " + sum);
        // Displaying the sum of proper divisors

        // Checking whether the number is an abundant number
        // A number is abundant if sum of proper divisors > the number itself
        if (sum > original) {
            System.out.println("The given number is an abundant number");
            // Printed when the number is abundant
        } else {
            System.out.println("The given number is not an abundant number");
            // Printed when the number is not abundant
        }
    }
}
