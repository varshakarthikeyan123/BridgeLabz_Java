/*
 This program checks whether a given number is a Harshad (Niven) number.
 A Harshad number is a number that is divisible by the sum of its digits.
 The program takes a number as input, calculates the sum of its digits,
 and checks divisibility.
*/
package coreprogramming.controlflowpractices.level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class HarshadNumber {
    // Main class definition

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int N = input.nextInt();
        // Reading the number from the user

        int original = N;
        // Storing the original number for later divisibility check

        int sum = 0;
        // Variable to store the sum of digits of the number

        // Loop to extract each digit and calculate the sum of digits
        while (N > 0) {

            int digit = N % 10;
            // Extracting the last digit of the number

            sum += digit;
            // Adding the extracted digit to the sum

            N = N / 10;
            // Removing the last digit from the number
        }

        // Checking if the original number is divisible by the sum of its digits
        if (original % sum == 0) {
            System.out.println("The given number is a Harshad number");
            // Printed if the number is divisible by the digit sum
        }
        else {
            System.out.println("The given number is not a Harshad number");
            // Printed if the number is not divisible by the digit sum
        }
    }
}
