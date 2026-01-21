/*
 This program finds the most frequent character in a given string.
 It reads a string from the user, checks each character,
 counts its occurrences, and identifies the character
 with the highest frequency.
*/
package coreprogramming.Extras;

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class FrequentCharacter {
    // Class that contains the logic to find the most frequent character

    public static void main(String[] args) {
        // Main method where execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        // Prompting the user to enter a string
        String text = input.nextLine();
        // Reading the input string

        int count = 0;
        // Variable to count occurrences of the current character

        int maxCount = 0;
        // Variable to store the maximum frequency found so far

        char mostFrequent = ' ';
        // Variable to store the most frequent character

        // Loop to iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            // Storing the current character

            count = 0;
            // Resetting count for the new character

            // Loop to count frequency of the current character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                    // Incrementing count if characters match
                }
            }

            // Checking if current character frequency is greater than maxCount
            if (count > maxCount) {
                maxCount = count;
                // Updating maximum frequency
                mostFrequent = ch;
                // Updating the most frequent character
            }
        }

        System.out.println("Most frequent character: '" + mostFrequent + "'");
        // Printing the most frequent character
    }
}
