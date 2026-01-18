/*
 This program finds the longest word in a given sentence.
 It scans the sentence character by character, builds words using letters,
 and compares their lengths to determine the longest word.
*/
package CoreProgramming.Extras;

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class LongestWord {
    // Class to find the longest word in a sentence

    public static void main(String[] args) {
        // Main method where execution starts

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a sentence: ");
        // Prompting the user to enter a sentence
        String sentence = scanner.nextLine();
        // Reading the complete sentence from the user

        String longestWord = "";
        // Variable to store the longest word found so far

        String currentWord = "";
        // Variable to temporarily store the current word being formed

        // Loop to traverse each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);
            // Extracting the character at index i

            if (Character.isLetter(ch)) {
                // Checking if the character is an alphabet
                currentWord += ch;
                // Appending the character to the current word
            }
            else {
                // When a non-letter character is encountered
                if (currentWord.length() > longestWord.length()) {
                    // Comparing current word length with longest word
                    longestWord = currentWord;
                    // Updating longest word if current word is longer
                }
                currentWord = "";
                // Resetting current word for the next word
            }
        }

        // Checking the last word in case the sentence ends with a letter
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
            // Updating longest word if the last word is longest
        }

        System.out.println("Longest word: " + longestWord);
        // Printing the longest word found
    }
}
