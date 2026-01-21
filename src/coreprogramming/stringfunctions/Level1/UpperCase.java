/*
 This program converts a given string to uppercase
 using two different approaches:
 1) A manual method that converts characters
    using ASCII value manipulation.
 2) Java’s inbuilt toUpperCase() method.
 It then compares the results of both methods
 to check whether they produce the same output.
 The program demonstrates string manipulation,
 loops, conditional checks, and comparison logic in Java.
*/

package coreprogramming.stringfunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class UpperCase {

    public static String manual(String text) {

        String result = " "; // initializes result string

        // iterates through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // gets character at current index

            // checks if character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // converts lowercase to uppercase using ASCII value
            }

            result += ch; // appends character to result string
        }
        return result; // returns manually converted uppercase string
    }

    public static String inBult(String text) {
        // converts string to uppercase using Java's inbuilt method
        return text.toUpperCase();
    }

    public static boolean compare(String text1, String text2) {

        // checks if both strings have the same length
        if (text1.length() != text2.length()) {
            return false;
        }

        // compares each character of both strings
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) { // compares characters
                return false;
            }
        }
        return true; // returns true if strings are identical
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String text = input.nextLine(); // reads input string

        String text1 = manual(text); // converts string to uppercase manually
        String text2 = inBult(text); // converts string to uppercase using inbuilt method

        System.out.println("Upper case by manual method is: " + text1); // displays manual result
        System.out.println("Upper case by inbuilt method is: " + text2); // displays inbuilt result

        if (compare(text1, text2)) { // checks if both methods give same result
            System.out.println("\nThe conversion from lower to upper in both the methods is the same.");
        } else {
            System.out.println("\nThe conversion from lower to upper in both the methods is not the same.");
        }
    }
}
