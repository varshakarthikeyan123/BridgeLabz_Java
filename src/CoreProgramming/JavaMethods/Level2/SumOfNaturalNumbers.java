/*
 This program calculates the sum of first N natural numbers
 using two different approaches:
 1) Recursion
 2) Mathematical formula
 It then compares both results to verify correctness.
*/
package CoreProgramming.JavaMethods.Level2;
// Package declaration for Java Methods Level 2 programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SumOfNaturalNumbers {
    // Class to demonstrate sum of natural numbers using recursion and formula

    // Recursive method to calculate sum of first N natural numbers
    public static int recursionSum(int N) {

        // Base case: when N is 0, sum is 0
        if (N == 0) {
            return 0;
            // Returning 0 to stop recursion
        }

        // Recursive case: add N to sum of numbers from 1 to (N-1)
        return N + recursionSum(N - 1);
        // Calling the same method with N-1
    }

    // Method to calculate sum using the mathematical formula
    public static int sumNumber(int N) {

        // Formula for sum of first N natural numbers: N * (N + 1) / 2
        int sum = N * (N + 1) / 2;
        // Calculating sum using formula

        return sum;
        // Returning the calculated sum
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int N = input.nextInt();
        // Reading the value of N from the user

        int result1 = recursionSum(N);
        // Calculating sum using recursive method

        int result2 = sumNumber(N);
        // Calculating sum using formula method

        // Comparing results from both methods
        if (result1 == result2) {
            System.out.println("Both methods provide the same output.");
            // Printed when both methods give identical results
        } else {
            System.out.println("They provide different output.");
            // Printed when results do not match
        }

        input.close();
        // Closing Scanner to free system resources
    }
}
