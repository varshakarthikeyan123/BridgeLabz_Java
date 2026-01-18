/*
 This program counts the number of vowels and consonants in a given string.
 It reads a string from the user, checks each character, and increments
 vowel or consonant counters based on simple character comparison logic.
*/
package CoreProgramming.Extras; // Specifies the package where this class belongs

import java.util.Scanner; // Imports Scanner class to take input from the user

public class VowelsConsonants { // Class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter a string: "); // Prompts the user to enter a string
        String text = input.nextLine(); // Reads the input string

        int vowels = 0; // Variable to count number of vowels

        int consonants = 0; // Variable to count number of consonants

        // Loop to traverse each character in the string
        for (int i = 0; i < text.length(); i++) { // Iterates through the string

            char ch = text.charAt(i); // Gets the current character

            // Checks if the character is a lowercase vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++; // Increments vowel count
            }
            // Counts all other characters as consonants as per given logic
            else {
                consonants++; // Increments consonant count
            }
        }

        System.out.println("The number of vowels in the given string is: " + vowels); // Prints vowel count
        System.out.println("The number of consonants in the given string is: " + consonants); // Prints consonant count
    }
}
