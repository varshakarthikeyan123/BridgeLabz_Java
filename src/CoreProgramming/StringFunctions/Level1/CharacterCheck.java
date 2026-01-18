/*
 This program checks whether two strings are equal
 using two different approaches:
 1) Character-by-character comparison using charAt().
 2) Direct comparison using the equals() method.
 It helps understand how string comparison works
 internally and how built-in methods simplify it.
 The program demonstrates string handling,
 loops, conditional checks, and boolean results in Java.
*/

package CoreProgramming.StringFunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class CharacterCheck {

    public static boolean checkCharacter(String text1, String text2) {

        // checks if both strings have the same length
        if (text1.length() != text2.length()) {
            System.out.println("Does not have the same length.");
            return false;
        }

        // compares each character of both strings
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) { // compares characters at same index
                return false;
            }
        }
        return true; // returns true if all characters match
    }

    public static boolean checkEqual(String text1, String text2) {
        // compares strings using built-in equals() method
        return text1.equals(text2);
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner scan = new Scanner(System.in); // creates Scanner object for user input

        System.out.print("Enter a string: "); // prompts user for first string
        String text1 = scan.nextLine(); // reads first string

        System.out.print("Enter another string: "); // prompts user for second string
        String text2 = scan.nextLine(); // reads second string

        boolean result1 = checkCharacter(text1, text2); // compares using charAt() logic
        boolean result2 = checkEqual(text1, text2); // compares using equals() method

        if (result1 && result2) { // checks if both methods return true
            System.out.println("The strings are equal proved by both methods.");
        } else {
            System.out.println("The strings are not equal proved by both methods.");
        }

        System.out.println("charAt() comparison result: " + result1); // displays char-by-char result
        System.out.println("equals() comparison result: " + result2); // displays equals() result
    }
}
