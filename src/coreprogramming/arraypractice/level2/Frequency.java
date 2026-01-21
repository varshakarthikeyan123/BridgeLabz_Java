/*
 This program finds the frequency of each digit in a given number.
 It extracts digits, stores them in an array, counts how many times
 each digit (0–9) appears, and displays the frequency result.
*/

package CoreProgramming.arraypractice.level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Frequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        int temp = number;
        // Temporary variable to preserve the original number

        int count = 0;
        // Variable to count the number of digits

        // Special case when number is 0
        if (temp == 0) {
            count = 1;
            // 0 has exactly one digit
        } else {
            // Loop to count digits in the number
            while (temp != 0) {
                count++;
                temp /= 10;
                // Removing last digit in each iteration
            }
        }

        int[] digits = new int[count];
        // Array to store individual digits of the number

        temp = number;
        // Resetting temp to original number

        // Loop to extract digits and store them in correct order
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            // Extracting last digit
            temp /= 10;
            // Removing last digit
        }

        int[] frequency = new int[10];
        // Array to store frequency of digits 0–9

        // Loop to count frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
            // Incrementing frequency for the digit
        }

        System.out.println("\nDigit Frequency:");

        // Loop to display frequency of digits that appear at least once
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        input.close();
        // Closing Scanner to release resources
    }
}
