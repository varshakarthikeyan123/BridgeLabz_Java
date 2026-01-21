/*
 This program removes leading and trailing spaces from a string
 using two different approaches:
 1) A custom method that uses charAt() to find the valid
    start and end positions and extracts the substring manually.
 2) Java’s built-in trim() method.
 It then compares both results character by character
 to verify that the custom trimming logic works correctly.
 The program demonstrates string traversal, loops,
 array usage, and comparison logic in Java.
*/

package CoreProgramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class TrimUsingCharAt {

    public static int[] findTrimIndices(String str) {

        int start = 0; // index for leading spaces
        int end = str.length() - 1; // index for trailing spaces

        // moves start index forward while leading spaces exist
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // moves end index backward while trailing spaces exist
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end}; // returns start and end indices
    }

    public static String substringUsingCharAt(String str, int start, int end) {

        String result = ""; // stores trimmed string

        // builds substring using charAt()
        for (int i = start; i <= end; i++) {
            result += str.charAt(i); // appends character to result
        }

        return result; // returns manually trimmed string
    }

    public static boolean compareStringsUsingCharAt(String s1, String s2) {

        // checks if both strings have same length
        if (s1.length() != s2.length()) {
            return false;
        }

        // compares characters of both strings
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true; // returns true if both strings are identical
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a string with leading and trailing spaces: "); // prompts user
        String input = sc.nextLine(); // reads input string

        int[] indices = findTrimIndices(input); // finds trim start and end indices

        String trimmedUsingCharAt = substringUsingCharAt(
                input, indices[0], indices[1]); // trims string using charAt logic

        String trimmedUsingBuiltIn = input.trim(); // trims string using built-in method

        boolean isSame = compareStringsUsingCharAt(
                trimmedUsingCharAt, trimmedUsingBuiltIn); // compares both results

        System.out.println("Trimmed using charAt(): " + trimmedUsingCharAt); // displays custom trim
        System.out.println("Trimmed using built-in trim(): " + trimmedUsingBuiltIn); // displays built-in trim
        System.out.println("Are both strings equal? " + isSame); // displays comparison result
    }
}
