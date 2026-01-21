/*
 This program finds and prints all the factors of a given number.
 It validates the input to ensure the number is positive.
 The logic checks every number from 1 to N and prints those
 which divide N exactly.
*/
package CoreProgramming.controlflowpractices.level2;
// Package declaration for Level 2 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Factors {

    // Method to find and print all factors of a number
    public static void findingFactors(int N) {

        // Loop to ensure the number entered is positive
        while (N < 0) {
            System.out.print("Enter a positive integer: ");
            N = new Scanner(System.in).nextInt();
            // Taking new input if the number is negative
        }

        // Loop to check each number from 1 to N
        for (int i = 1; i <= N; i++) {

            // Checking if i is a factor of N
            if (N % i == 0) {
                System.out.println(i);
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
        // Calling the method to find and print factors of the number
    }
}
