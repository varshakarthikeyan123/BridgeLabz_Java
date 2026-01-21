/*
 This program finds and displays all unique characters
 present in a given string.
 It does not use built-in length() or collections.
 Instead, it:
 1) Calculates string length using exception handling.
 2) Iterates through each character.
 3) Stores only characters that have not appeared before.
 The program demonstrates string traversal,
 nested loops, arrays, and basic uniqueness logic in Java.
*/

package CoreProgramming.stringfunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class UniqueCharacters {

    public static int stringLength(String str) {

        int length = 0; // counter to store string length

        try {
            // accesses characters until index goes out of bounds
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // exception occurs when index exceeds string length
        }

        return length; // returns calculated string length
    }

    public static char[] findUniqueChars(String str) {

        int len = stringLength(str); // gets string length
        char[] unique = new char[len]; // temporary array to store unique characters
        int count = 0; // counts number of unique characters found

        // iterates through each character in the string
        for (int i = 0; i < len; i++) {

            char ch = str.charAt(i); // gets current character
            boolean isUnique = true; // flag to check uniqueness

            // checks if character already exists in unique array
            for (int j = 0; j < count; j++) {
                if (unique[j] == ch) {
                    isUnique = false; // character already found
                    break;
                }
            }

            if (isUnique) {
                unique[count] = ch; // stores unique character
                count++; // increments unique character count
            }
        }

        char[] result = new char[count]; // creates result array with exact size

        // copies unique characters into result array
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }

        return result; // returns array of unique characters
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String input = sc.nextLine(); // reads input string

        char[] uniqueChars = findUniqueChars(input); // finds unique characters

        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " "); // displays each unique character
        }
    }
}
