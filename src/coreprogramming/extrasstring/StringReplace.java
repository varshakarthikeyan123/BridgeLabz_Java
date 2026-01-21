/*
 This program replaces a specific word in a sentence.
 It reads a sentence, the word to be replaced,
 and the new word, then prints the modified sentence.
*/
package coreprogramming.Extras;
// Package declaration

import java.util.Scanner;
// Scanner class is used to take input from the user

public class StringReplace {

    // Method to replace a specific word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        // Stores the final modified sentence

        String word = "";
        // Temporarily stores each word

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word += ch;
                // Building the word
            } else {
                // Replace word if it matches oldWord
                if (word.equals(oldWord)) {
                    result += newWord;
                } else {
                    result += word;
                }

                result += " ";
                // Add space after each word

                word = "";
                // Reset word
            }
        }

        // Handling the last word
        if (word.equals(oldWord)) {
            result += newWord;
        } else {
            result += word;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        // Reading sentence

        System.out.print("Enter the word to replace: ");
        String oldWord = input.next();
        // Reading old word

        System.out.print("Enter the new word: ");
        String newWord = input.next();
        // Reading new word

        String replacedSentence = replaceWord(sentence, oldWord, newWord);
        // Calling replace method

        System.out.println("Modified sentence: " + replacedSentence);
        // Displaying result
    }
}
