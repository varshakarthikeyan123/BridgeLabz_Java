/*
 This program removes duplicate characters from a given string.
 It scans the string character by character and builds a new string
 containing only the first occurrence of each character.
*/
package coreprogramming.Extras;

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class NonDuplicateString {
    // Class to handle removal of duplicate characters from a string

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String text) {

        String result = "";
        // Variable to store the final string without duplicate characters

        // Loop through each character of the input string
        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            // Extracting the current character from the string

            boolean found = false;
            // Flag to check whether the character already exists in result

            // Loop through the result string to check for duplicates
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    // Checking if current character already exists
                    found = true;
                    // Marking character as found
                    break;
                    // Exiting loop once duplicate is found
                }
            }

            // If the character is not found in result
            if (!found) {
                result += current;
                // Adding the character to the result string
            }
        }

        return result;
        // Returning the string without duplicate characters
    }

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner scan = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        // Prompting the user to enter a string
        String text = scan.nextLine();
        // Reading the input string from the user

        String output = removeDuplicates(text);
        // Calling method to remove duplicate characters

        System.out.println("String after removing duplicates: " + output);
        // Printing the final string without duplicates
    }
}
