package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class LongestWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        // Reading the full sentence

        String longestWord = "";
        // Stores the longest word found so far

        String currentWord = "";
        // Temporarily stores the current word being formed

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);
            // Getting the current character

            // If character is a letter, add it to current word
            if (Character.isLetter(ch)) {
                currentWord += ch;
            }
            else {
                // If non-letter is found, compare current word with longest word
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                // Reset current word
                currentWord = "";
            }
        }

        // Final check in case the sentence ends with a word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        // Printing the longest word
        System.out.println("Longest word: " + longestWord);
    }
}
