/*
 This program counts the number of digits in a given integer.
 It repeatedly removes the last digit of the number using division
 and increments a counter until the number becomes zero.
*/
package coreprogramming.controlflowpractices.level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class NumberOfDigits {
    // Main class definition

    public static void main(String[] args) {
        // Main method where program execution begins

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input from the user

        System.out.print("Enter a number: ");
        int N = input.nextInt();
        // Reading an integer number from the user

        int count = 0;
        // Variable to store the count of digits

        // Loop runs until the number becomes 0
        // Each iteration removes one digit
        while (N != 0) {

            N = N / 10;
            // Removing the last digit of the number

            count++;
            // Increasing the digit count by 1
        }

        System.out.println(count);
        // Printing the total number of digits in the given number
    }
}
