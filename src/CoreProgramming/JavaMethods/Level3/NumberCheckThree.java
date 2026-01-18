/*
 This package CoreProgramming.JavaMethods.Level3 contains programs that perform
 advanced digit-based number checks using methods and arrays.
 This program checks whether a number is a Palindrome and a Duck Number
 by converting the number into a digit array and applying array operations.
*/
package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;
// Scanner is used to take input from the user

public class NumberCheck3 {

    // Method to count how many digits are present in the number
    public static int digitCount(int number) {
        // Special case: if number is 0, it has one digit
        if (number == 0) {
            return 1;
        }

        int count = 0;
        // Variable to store digit count

        // Loop until number becomes 0
        while (number > 0) {
            count++;
            // Increment digit count
            number /= 10;
            // Remove the last digit
        }
        return count;
        // Return total digit count
    }

    // Method to store each digit of the number into an array
    public static int[] digitArray(int number, int count) {
        int[] digits = new int[count];
        // Array to store digits

        // Fill array from right to left to maintain digit order
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            // Extract last digit
            number /= 10;
            // Remove last digit
        }
        return digits;
        // Return digit array
    }

    // Method to reverse the digit array
    public static int[] reverseArray(int[] digits) {
        int[] reverse = new int[digits.length];
        // Array to store reversed digits

        // Copy elements in reverse order
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
            // Assign elements from end to start
        }
        return reverse;
        // Return reversed array
    }

    // Method to compare two arrays element by element
    public static boolean compareArrays(int[] a1, int[] a2) {
        // If lengths differ, arrays are not equal
        if (a1.length != a2.length) return false;

        // Compare each corresponding element
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
                // Return false if mismatch found
            }
        }
        return true;
        // Return true if all elements match
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        // Reverse the digit array
        return compareArrays(digits, reversed);
        // Compare original and reversed arrays
    }

    // Method to check if the number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        // Duck number contains at least one zero
        for (int d : digits) {
            if (d == 0) {
                return true;
                // Return true if zero is found
            }
        }
        return false;
        // Return false if no zero is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating Scanner object for user input

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        // Reading the number

        int count = digitCount(number);
        // Counting digits of the number

        int[] digits = digitArray(number, count);
        // Converting number into digit array

        System.out.println("Is Palindrome: " + isPalindrome(digits));
        // Printing palindrome check result

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        // Printing duck number check result
    }
}
