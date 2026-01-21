/*
 This program toggles the case of each character in a given string.
 Lowercase letters are converted to uppercase, uppercase letters are
 converted to lowercase, and non-alphabet characters remain unchanged.
*/
package coreprogramming.Extras; // Defines the package name for this program

import java.util.Scanner; // Imports Scanner class to take input from the user

public class ToggleCase { // Class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter a string: "); // Prompts the user to enter a string
        String text = input.nextLine(); // Reads the input string

        String result = ""; // Stores the final string after toggling cases

        // Loop through each character in the input string
        for (int i = 0; i < text.length(); i++) { // Iterates over the string characters

            char ch = text.charAt(i); // Gets the current character

            // Checks if the character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32); // Converts lowercase to uppercase
            }
            // Checks if the character is uppercase
            else if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32); // Converts uppercase to lowercase
            }
            // Handles non-alphabet characters
            else {
                result += ch; // Adds the character as it is
            }
        }

        System.out.println("The toggled cases are: " + result); // Prints the toggled string
    }
}
