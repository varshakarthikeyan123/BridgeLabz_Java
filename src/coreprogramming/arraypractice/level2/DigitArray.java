/*
 This program extracts all digits from a given number,
 stores them in an array with dynamic resizing,
 and then finds the largest and second largest digits.
*/
package CoreProgramming.arraypractice.level2; // Defines the package for Level 2 array practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class DigitArray { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read input

        System.out.println("Enter a number: "); // Prompts user to enter a number
        int number = input.nextInt(); // Reads the number from the user

        int maxDigit = 10; // Initial size of the digits array

        int[] digits = new int[maxDigit]; // Array to store digits of the number

        int index = 0; // Keeps track of how many digits are stored

        // Loop to extract digits from the number
        while (number != 0) { // Continues until all digits are processed

            // If the array is full, increase its size dynamically
            if (index == maxDigit) { // Checks if array capacity is reached

                maxDigit += 10; // Increases array size by 10

                int[] temp = new int[maxDigit]; // Creates a new larger array

                // Copies existing digits into the new array
                for (int i = 0; i < digits.length; i++) { // Iterates through old array
                    temp[i] = digits[i]; // Copies each element
                }

                digits = temp; // Assigns resized array back to digits
            }

            digits[index] = number % 10; // Extracts the last digit and stores it

            number = number / 10; // Removes the last digit from the number

            index++; // Moves to the next index position
        }

        int largest = 0; // Variable to store the largest digit

        int secondLargest = 0; // Variable to store the second largest digit

        // Loop to find the largest and second largest digits
        for (int i = 0; i < index; i++) { // Iterates through stored digits

            if (digits[i] > largest) { // Checks if current digit is greater than largest
                secondLargest = largest; // Updates second largest
                largest = digits[i]; // Updates largest digit
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                // Checks if digit is between largest and second largest
                secondLargest = digits[i]; // Updates second largest digit
            }
        }

        System.out.println("Largest digit: " + largest); // Displays the largest digit
        System.out.println("Second largest digit: " + secondLargest); // Displays second largest digit

        input.close(); // Closing Scanner to release resources
    }
}
