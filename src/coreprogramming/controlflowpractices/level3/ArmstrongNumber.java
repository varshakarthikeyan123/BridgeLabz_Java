/*
 This program checks whether a given number is an Armstrong Number.
 An Armstrong number is a number that is equal to the sum of its digits
 each raised to the power of the total number of digits.
*/
package CoreProgramming.controlflowpractices.level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ArmstrongNumber {
    // Main class definition

    public static void main(String[] args) {
        // Main method where program execution begins

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input from the user

        System.out.print("Enter number: ");
        // Prompting the user to enter a number
        int N = input.nextInt();
        // Reading the number entered by the user

        int length = (int) Math.log10(N) + 1;
        // Calculating the number of digits in the number
        // log10(N) gives digits - 1, so adding 1 gives total digits

        System.out.println("The length of the given number is: " + length);
        // Displaying the number of digits

        int original = N;
        // Storing the original number for comparison later

        System.out.println("The original number is: " + original);
        // Displaying the original number

        int sum = 0;
        // Variable to store the sum of digits raised to power length

        // Loop to extract each digit and compute Armstrong sum
        while (N > 0) {

            int digit = N % 10;
            // Extracting the last digit of the number

            sum += Math.pow(digit, length);
            // Raising the digit to the power of number of digits and adding to sum

            N = N / 10;
            // Removing the last digit from the number
        }

        System.out.println("The sum of the given number is: " + sum);
        // Displaying the calculated Armstrong sum

        // Checking whether the number is an Armstrong number
        if (original == sum) {
            System.out.println("The given number is an Armstrong number.");
            // Printed if the number satisfies Armstrong condition
        } else {
            System.out.println("The given number is not an Armstrong number.");
            // Printed if the number does not satisfy Armstrong condition
        }
    }
}
