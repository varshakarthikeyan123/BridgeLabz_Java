package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;

public class NumberCheck3 {

    // Method to count how many digits are present in the number
    public static int digitCount(int number) {
        int count = 0;
        // Loop until number becomes 0, counting each digit
        while (number > 0) {
            count++;
            number /= 10; // Remove the last digit
        }
        return count;
    }

    // Method to store each digit of the number into an array
    public static int[] digitArray(int number, int count) {
        int[] digits = new int[count];
        // Fill array from right to left to maintain digit order
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10; // Extract last digit
            number /= 10;            // Remove last digit
        }
        return digits;
    }

    // Method to reverse the digit array
    public static int[] reverseArray(int[] digits) {
        int[] reverse = new int[digits.length];
        // Copy elements from original array in reverse order
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }
        return reverse;
    }

    // Method to compare two arrays element by element
    public static boolean compareArrays(int[] a1, int[] a2) {
        // If lengths differ, arrays cannot be equal
        if (a1.length != a2.length) return false;

        // Compare each corresponding element
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        // Reverse the digit array
        int[] reversed = reverseArray(digits);
        // Check if original and reversed arrays are the same
        return compareArrays(digits, reversed);
    }

    // Method to check if the number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        // Duck number contains at least one zero
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        // Count digits of the number
        int count = digitCount(number);

        // Convert number into digit array
        int[] digits = digitArray(number, count);

        // Check and display palindrome result
        System.out.println("Is Palindrome: " + isPalindrome(digits));

        // Check and display duck number result
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}
