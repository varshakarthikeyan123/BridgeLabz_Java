/*
 This program compares two strings lexicographically (dictionary order).
 It compares characters one by one using their ASCII values.
 If all compared characters are equal, the comparison is based on string length.
*/
package coreprogramming.Extras;

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class LexicographicalCompare {
    // Class to perform lexicographical comparison of two strings

    public static void main(String[] args) {
        // Main method where program execution begins

        Scanner input = new Scanner(System.in);
        // Creating Scanner object for reading user input

        System.out.print("Enter first string: ");
        // Prompting user to enter the first string
        String s1 = input.nextLine();
        // Reading the first string

        System.out.print("Enter second string: ");
        // Prompting user to enter the second string
        String s2 = input.nextLine();
        // Reading the second string

        int i = 0;
        // Index variable used to traverse both strings

        int minLength = Math.min(s1.length(), s2.length());
        // Finding the minimum length of the two strings

        // Loop to compare characters at each position
        while (i < minLength) {

            char c1 = s1.charAt(i);
            // Extracting character from first string at index i

            char c2 = s2.charAt(i);
            // Extracting character from second string at index i

            if (c1 < c2) {
                // If first string character comes before second
                System.out.println("First string " + s1 + " comes before second string " + s2 + ".");
                input.close();
                // Closing Scanner object
                return;
                // Exiting the program
            }
            else if (c1 > c2) {
                // If first string character comes after second
                System.out.println("First string " + s1 + " comes after second string " + s2 + ".");
                input.close();
                // Closing Scanner object
                return;
                // Exiting the program
            }

            i++;
            // Moving to the next character index
        }

        // If all compared characters are equal, compare string lengths
        if (s1.length() < s2.length()) {
            // First string is shorter
            System.out.println("First string comes before second string");
        }
        else if (s1.length() > s2.length()) {
            // First string is longer
            System.out.println("First string comes after second string");
        }
        else {
            // Both strings have same length and characters
            System.out.println("Both strings are equal");
        }

        input.close();
        // Closing Scanner object
    }
}
