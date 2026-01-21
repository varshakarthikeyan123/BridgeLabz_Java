/*
 This program checks whether a given string is a palindrome.
 A palindrome is a string that reads the same forwards and backwards.
 The program uses two pointers (start and end) to compare characters
 from both ends of the string until they meet in the middle.
*/
package coreprogramming.Extras;
// Package declaration that groups this class under CoreProgramming.Extras

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class Palindrome {
    // Class definition for Palindrome checking logic

    // Method to check whether the given string is a palindrome
    public static boolean checkPalindrome(String text) {

        int start = 0;
        // Initializing start index at the beginning of the string

        int end = text.length() - 1;
        // Initializing end index at the last character of the string

        // Loop continues until start index is less than end index
        while (start < end) {

            // Checking if characters at start and end positions are different
            if (text.charAt(start) != text.charAt(end)) {
                return false;
                // Returning false immediately if mismatch is found
            }

            start++;
            // Incrementing start index to move forward

            end--;
            // Decrementing end index to move backward
        }

        return true;
        // Returning true if all character comparisons match
    }

    public static void main(String[] args) {
        // Main method where program execution begins

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input from console

        System.out.print("Enter a string: ");
        // Prompting the user to enter a string

        String text = input.nextLine();
        // Reading the entered string

        boolean check = checkPalindrome(text);
        // Calling the palindrome checking method and storing the result

        // Checking the returned result and printing appropriate message
        if (check) {
            System.out.println("The string is a palindrome.");
            // Printed when the string is a palindrome
        }
        else {
            System.out.println("The string is not a palindrome.");
            // Printed when the string is not a palindrome
        }
    }
}
