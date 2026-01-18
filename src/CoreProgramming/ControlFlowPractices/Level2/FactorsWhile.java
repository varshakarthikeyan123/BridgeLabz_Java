/*
 This program finds and prints all the factors of a given number
 using a while loop.
 It validates the input to ensure the number is positive
 and then checks every number from 1 to N to find factors.
*/
package CoreProgramming.ControlFlowPractices.Level2;
// Package declaration for Level 2 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FactorsWhile {
    // Main class definition

    // Method to find and print all factors of a number using while loop
    public static void findingFactors(int N) {

        // Loop to ensure the number entered is positive
        while (N < 0) {
            System.out.print("Enter a positive integer: ");
            N = new Scanner(System.in).nextInt();
            // Taking new input if the number is negative
        }

        int count = 0;
        // Counter variable to check numbers from 1 to N

        // Loop to check each number from 1 to N
        while (count < N) {
            count++;
            // Incrementing count to move to the next number

            // Checking if the current count is a factor of N
            if (N % count == 0) {
                System.out.println(count);
                // Printing the factor
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting user to enter a number
        int N = input.nextInt();
        // Reading the number from the user

        findingFactors(N);
        // Calling the method to find and print factors
    }
}
