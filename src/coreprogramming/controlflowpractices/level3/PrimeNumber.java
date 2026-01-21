/*
 This program checks whether a given number is a Prime number.
 A prime number is a number greater than 1 that has no divisors
 other than 1 and itself.
*/
package CoreProgramming.controlflowpractices.level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class PrimeNumber {
    // Main class definition

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number to be checked

        boolean isPrime = true;
        // Flag variable assuming the number is prime initially

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        }
        else {
            // Loop to check divisibility from 2 to (number - 1)
            for (int i = 2; i < number; i++) {

                // If number is divisible by any value, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break;
                    // Exit loop as a divisor is found
                }
            }
        }

        // Displaying result based on isPrime flag
        if (isPrime) {
            System.out.println(number + " is a Prime number");
        }
        else {
            System.out.println(number + " is not a Prime number");
        }
    }
}
