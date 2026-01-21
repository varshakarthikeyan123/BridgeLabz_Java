/*
 This program extracts digits from a given number using an array.
 It stores each digit, then finds and displays the largest
 and second largest digits among them.
*/
package coreprogramming.arraypractice.level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Digits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        int maxDigit = 10;
        // Maximum number of digits that can be stored

        int[] digit = new int[maxDigit];
        // Array to store digits of the number

        int index = 0;
        // Keeps track of number of digits stored

        // Loop to extract digits from the number
        while (number != 0) {

            digit[index] = number % 10;
            // Storing the last digit of the number

            number = number / 10;
            // Removing the last digit from the number

            index++;
            // Moving to the next index position

            // Stop if array size limit is reached
            if (index == maxDigit) {
                break;
            }
        }

        int largest = 0;
        // Variable to store the largest digit

        int secondLargest = 0;
        // Variable to store the second largest digit

        // Loop to find the largest and second largest digits
        for (int i = 0; i < index; i++) {

            if (digit[i] > largest) {
                secondLargest = largest;
                // Updating second largest before updating largest
                largest = digit[i];
            }
            else if (digit[i] > secondLargest && digit[i] != largest) {
                secondLargest = digit[i];
                // Updating second largest if condition is satisfied
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
