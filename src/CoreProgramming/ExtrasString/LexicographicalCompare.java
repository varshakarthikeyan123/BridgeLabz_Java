package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class LexicographicalCompare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object for user input

        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        // Reading first string

        System.out.print("Enter second string: ");
        String s2 = input.nextLine();
        // Reading second string

        int i = 0;
        // Index variable to traverse both strings

        int minLength = Math.min(s1.length(), s2.length());
        // Finding the minimum length to avoid index out of bounds

        // Loop to compare characters one by one
        while (i < minLength) {

            char c1 = s1.charAt(i);
            // Character from first string at index i

            char c2 = s2.charAt(i);
            // Character from second string at index i

            // If character of first string comes before second string
            if (c1 < c2) {
                System.out.println("First string " + s1 + " comes before second string " + s2 + ".\n");
                input.close();
                return;
            }
            // If character of first string comes after second string
            else if (c1 > c2) {
                System.out.println("First string " + s1 + " comes after second string " + s2 + ".\n");
                input.close();
                return;
            }

            i++;
            // Move to next character
        }

        // If all compared characters are equal, compare string lengths
        if (s1.length() < s2.length()) {
            System.out.println("First string comes before second string");
        }
        else if (s1.length() > s2.length()) {
            System.out.println("First string comes after second string");
        }
        else {
            System.out.println("Both strings are equal");
        }
    }
}
