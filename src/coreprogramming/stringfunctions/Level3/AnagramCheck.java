/*
 This program checks whether two given strings
 are anagrams of each other.
 Two strings are anagrams if they contain
 the same characters with the same frequency,
 but possibly in a different order.
 The program uses frequency counting with arrays
 to compare both strings efficiently.
*/

package coreprogramming.stringfunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class AnagramCheck {

    public static boolean isAnagram(String text1, String text2) {

        // checks if both strings have the same length
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[256]; // frequency array for first string (ASCII characters)
        int[] freq2 = new int[256]; // frequency array for second string

        // counts frequency of each character in both strings
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++; // increments count for character in first string
            freq2[text2.charAt(i)]++; // increments count for character in second string
        }

        // compares frequency of all characters
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // returns false if any frequency mismatch is found
            }
        }

        return true; // returns true if all frequencies match
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for user input

        System.out.print("Enter first string: "); // prompts user for first string
        String text1 = sc.nextLine(); // reads first string

        System.out.print("Enter second string: "); // prompts user for second string
        String text2 = sc.nextLine(); // reads second string

        if (isAnagram(text1, text2)) { // checks if strings are anagrams
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
