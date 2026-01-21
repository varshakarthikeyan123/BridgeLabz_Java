/*
 This program splits a given sentence into words
 using two different approaches:
 1) A custom split method that manually processes
    the string without using split().
 2) Java’s built-in split() method.
 It then compares both results to check whether
 the custom implementation works correctly.
 The program demonstrates string traversal,
 arrays, nested loops, and comparison logic in Java.
*/

package CoreProgramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class StringSplit {

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

        int length = findLength(text); // finds length of the input string
        int wordCount = 0; // counts number of words

        // counts words based on space separation
        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') ||
                    (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1]; // stores indexes of spaces
        int index = 0;
        spaceIndexes[index++] = -1; // starting boundary before first word

        // stores indexes where space occurs
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length; // ending boundary after last word

        String[] words = new String[wordCount]; // array to store words

        // extracts words using space indexes
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j); // builds word character by character
            }
            words[i] = word; // stores word in array
        }

        return words; // returns array of words
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        // checks if both arrays have same length
        if (arr1.length != arr2.length)
            return false;

        // compares each element of both arrays
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true; // returns true if arrays are identical
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a sentence: "); // prompts user to enter a sentence
        String input = sc.nextLine(); // reads input sentence

        String[] customResult = customSplit(input); // splits sentence using custom method
        String[] builtInResult = input.split(" "); // splits sentence using built-in method

        System.out.println("\nCustom Split Result:");
        for (String word : customResult) {
            System.out.println(word); // prints each word from custom split
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInResult) {
            System.out.println(word); // prints each word from built-in split
        }

        boolean isSame = compareArrays(customResult, builtInResult); // compares both results
        System.out.println("\nAre both results same? " + isSame); // displays comparison result
    }
}
