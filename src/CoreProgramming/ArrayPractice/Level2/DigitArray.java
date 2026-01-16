package CoreProgramming.ArrayPractice.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class DigitArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        int maxDigit = 10;
        // Initial size of the digits array

        int[] digits = new int[maxDigit];
        // Array to store digits of the number

        int index = 0;
        // Keeps track of how many digits are stored

        // Loop to extract digits from the number
        while (number != 0) {

            // If array is full, increase its size dynamically
            if (index == maxDigit) {

                maxDigit += 10;
                // Increasing array size by 10

                int[] temp = new int[maxDigit];
                // Creating a new larger array

                // Copying old digits into the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
                // Assigning the resized array back to digits
            }

            digits[index] = number % 10;
            // Extracting the last digit of the number

            number = number / 10;
            // Removing the last digit from the number

            index++;
            // Moving to the next index position
        }

        int largest = 0;
        // Variable to store the largest digit

        int secondLargest = 0;
        // Variable to store the second largest digit

        // Loop to find the largest and second largest digits
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                // Updating second largest before changing largest
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
                // Updating second largest if condition is satisfied
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
        // Closing Scanner to release resources
    }
}
