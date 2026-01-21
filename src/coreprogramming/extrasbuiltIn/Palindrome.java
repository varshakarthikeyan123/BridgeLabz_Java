/*
 This program checks whether a given string is a Palindrome.
 A palindrome is a word or phrase that reads the same
 forward and backward (example: madam, level).
*/
package CoreProgramming.extrasbuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Palindrome {

    // Method to check whether a given string is a palindrome
    public static boolean checkPalindrome(String text) {

        int start = 0;
        // Pointer initialized to the beginning of the string

        int end = text.length() - 1;
        // Pointer initialized to the end of the string

        // Loop runs until the start pointer crosses the end pointer
        while (start < end) {

            // Checking if characters at both ends are equal
            if (text.charAt(start) != text.charAt(end)) {
                return false;
                // Returning false if characters do not match
            }

            start++;
            // Moving the start pointer forward

            end--;
            // Moving the end pointer backward
        }

        return true;
        // Returning true if all character pairs match
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the input string from the user

        boolean check = checkPalindrome(text);
        // Calling the palindrome checking method

        // Checking the result and displaying output
        if (check) {
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
        }

        input.close();
        // Closing Scanner to release resources
    }
}
