/*
 This program checks whether a given string is a palindrome
 using three different approaches:
 1) Iterative comparison using two pointers.
 2) Recursive comparison from both ends.
 3) Reversing the string using an array and comparing.
 It helps understand multiple logical ways to solve
 the same problem in Java.
*/

package coreprogramming.stringfunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String text) {

        int start = 0; // starting index
        int end = text.length() - 1; // ending index

        // compares characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // returns false if mismatch occurs
            }
            start++; // moves start forward
            end--; // moves end backward
        }
        return true; // returns true if string is palindrome
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {

        // base case: when indices cross or meet
        if (start >= end) {
            return true;
        }

        // checks characters at current positions
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // recursive call for next inner characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {

        int len = text.length(); // gets length of string
        char[] reverse = new char[len]; // array to store reversed string

        // fills array with characters in reverse order
        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }
        return reverse; // returns reversed character array
    }

    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray(); // converts string to char array
        char[] reverse = reverseString(text); // gets reversed array

        // compares original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false; // returns false if mismatch occurs
            }
        }
        return true; // returns true if arrays are equal
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String input = sc.nextLine(); // reads input string

        boolean result1 = isPalindromeIterative(input); // checks palindrome using iterative logic
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1); // checks using recursion
        boolean result3 = isPalindromeUsingArray(input); // checks using array method

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + result1); // displays iterative result
        System.out.println("Logic 2 (Recursive): " + result2); // displays recursive result
        System.out.println("Logic 3 (Array): " + result3); // displays array-based result
    }
}
