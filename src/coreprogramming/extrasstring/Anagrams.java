/*
 This program checks whether two given strings are anagrams.
 It ignores spaces and letter case, compares character frequencies,
 and determines if both strings contain the same characters
 in the same counts.
*/
package CoreProgramming.Extras;

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class Anagrams {
    // Main class that contains the program logic

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object for user input

        System.out.print("Enter first string: ");
        // Prompting user to enter the first string
        String s1 = input.nextLine();
        // Reading the first string

        System.out.print("Enter second string: ");
        // Prompting user to enter the second string
        String s2 = input.nextLine();
        // Reading the second string

        s1 = s1.replace(" ", "").toLowerCase();
        // Removing spaces and converting first string to lowercase

        s2 = s2.replace(" ", "").toLowerCase();
        // Removing spaces and converting second string to lowercase

        if (s1.length() != s2.length()) {
            // Checking if both strings have the same length
            System.out.println("The strings are NOT anagrams.");
            // Printing result if lengths do not match
            input.close();
            // Closing the Scanner
            return;
            // Exiting the program
        }

        int count = 0;
        // Variable to count matching character frequencies

        for (int i = 0; i < s1.length(); i++) {
            // Looping through each character of the first string

            char ch = s1.charAt(i);
            // Extracting the current character

            int freq1 = 0;
            // Frequency counter for first string

            int freq2 = 0;
            // Frequency counter for second string

            for (int j = 0; j < s1.length(); j++) {
                // Looping through both strings to count character frequency

                if (s1.charAt(j) == ch)
                    freq1++;
                // Incrementing frequency if character matches in first string

                if (s2.charAt(j) == ch)
                    freq2++;
                // Incrementing frequency if character matches in second string
            }

            if (freq1 == freq2) {
                // Checking if both frequencies are equal
                count++;
                // Incrementing count if frequencies match
            }
        }

        if (count == s1.length()) {
            // Checking if all characters matched in frequency
            System.out.println("The strings are anagrams.");
            // Printing result if strings are anagrams
        } else {
            System.out.println("The strings are NOT anagrams.");
            // Printing result if strings are not anagrams
        }
    }
}
