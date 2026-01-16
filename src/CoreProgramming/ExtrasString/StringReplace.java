package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class StringReplace {

    // Method to replace a specific word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        // Stores the final modified sentence

        String word = "";
        // Temporarily stores each word while traversing the sentence

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);
            // Current character

            // Build the word character by character until space is found
            if (ch != ' ') {
                word += ch;
            }
            else {
                // If the word matches the old word, replace it
                if (word.equals(oldWord)) {
                    result += newWord;
                } else {
                    result += word;
                }

                result += " ";
                // Add space after each word

                word = "";
                // Reset word for next iteration
            }
        }

        // Handling the last word in the sentence
        if (word.equals(oldWord)) {
            result += newWord;
        } else {
            result += word;
        }

        return result;
        // Returning the modified sentence
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        // Reading the sentence

        System.out.print("Enter the word to replace: ");
        String oldWord = input.next();
        // Reading the word to be replaced

        System.out.print("Enter the new word: ");
        String newWord = input.next();
        // Reading the replacement word

        String replacedSentence = replaceWord(sentence, oldWord, newWord);
        // Calling replaceWord method

        System.out.println("Modified sentence: " + replacedSentence);
        // Printing the modified sentence
    }
}
