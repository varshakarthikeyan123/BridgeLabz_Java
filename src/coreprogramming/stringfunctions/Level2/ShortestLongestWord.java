/*
 This program finds the shortest and longest words
 from a given sentence entered by the user.
 It does not use built-in string length or split methods.
 Instead, it manually:
 1) Finds string length using exception handling.
 2) Splits the sentence into words.
 3) Creates a table of words and their lengths.
 4) Identifies the shortest and longest words.
 The program demonstrates string traversal,
 arrays, exception handling, and comparison logic in Java.
*/

package CoreProgramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class for user input

public class ShortestLongestWord {

    public static int findLength(String text) {

        int count = 0; // counter to store length

        try {
            // keeps accessing characters until exception occurs
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index goes out of bounds
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
        int index = 0; // index for words array
        String word = ""; // temporary string to build each word

        // extracts words manually
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i); // appends character to word
            } else if (!word.equals("")) {
                words[index++] = word; // stores completed word
                word = ""; // resets word
            }
        }

        // stores last word if present
        if (!word.equals("")) {
            words[index] = word;
        }

        return words; // returns array of words
    }

    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2]; // table for word and its length

        // fills table with words and their lengths
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i]; // stores word
            table[i][1] = String.valueOf(findLength(words[i])); // stores word length
        }

        return table; // returns word-length table
    }

    public static int[] findShortestAndLongest(String[][] table) {

        int shortestIndex = 0; // index of shortest word
        int longestIndex = 0; // index of longest word

        int shortestLength = Integer.parseInt(table[0][1]); // initial shortest length
        int longestLength = Integer.parseInt(table[0][1]); // initial longest length

        // compares word lengths to find shortest and longest
        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex}; // returns indices of shortest and longest words
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a sentence: "); // prompts user to enter a sentence
        String input = sc.nextLine(); // reads sentence

        String[] words = customSplit(input); // splits sentence into words
        String[][] table = createWordLengthTable(words); // creates word-length table
        int[] result = findShortestAndLongest(table); // finds shortest and longest words

        System.out.println("\nWord \t Length");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " \t " + Integer.parseInt(table[i][1]));
        }

        System.out.println("\nShortest Word: " + table[result[0]][0]); // displays shortest word
        System.out.println("Longest Word: " + table[result[1]][0]); // displays longest word
    }
}
