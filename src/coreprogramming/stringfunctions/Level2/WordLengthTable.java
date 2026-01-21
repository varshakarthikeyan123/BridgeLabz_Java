/*
 This program creates a table that displays each word
 in a given sentence along with its length.
 It does not use built-in split() or length() methods.
 Instead, it manually:
 1) Calculates string length using exception handling.
 2) Splits the sentence into words.
 3) Stores each word with its corresponding length
    in a two-dimensional array.
 The program demonstrates string traversal,
 arrays, loops, and formatted output in Java.
*/

package coreprogramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class WordLengthTable {

    public static int findLength(String text) {

        int count = 0; // counter to store string length

        try {
            // keeps accessing characters until index goes out of bounds
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index exceeds string length
        }

        return count; // returns calculated length
    }

    public static String[] customSplit(String text) {

        int length = findLength(text); // finds length of input string
        int wordCount = 0; // counts number of words

        // counts words based on space separation
        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') ||
                    (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount]; // array to store words
        int wordIndex = 0; // index for words array
        String word = ""; // temporary string to build each word

        // extracts words manually
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i); // appends character to word
            } else if (!word.equals("")) {
                words[wordIndex++] = word; // stores completed word
                word = ""; // resets word
            }
        }

        // stores last word if present
        if (!word.equals("")) {
            words[wordIndex] = word;
        }

        return words; // returns array of words
    }

    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2]; // stores word and its length

        // fills table with words and their lengths
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i]; // stores word
            table[i][1] = String.valueOf(findLength(words[i])); // stores word length
        }

        return table; // returns word-length table
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a sentence: "); // prompts user to enter a sentence
        String input = sc.nextLine(); // reads input sentence

        String[] words = customSplit(input); // splits sentence into words
        String[][] result = createWordLengthTable(words); // creates word-length table

        System.out.println("\nWord\tLength");

        // displays each word with its length
        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + " \t " + length);
        }
    }
}
