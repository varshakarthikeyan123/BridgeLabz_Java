/*
 This program converts a given string to lowercase
 using two different approaches:
 1) A manual method that converts each character
    using ASCII value manipulation.
 2) An inbuilt Java method using toLowerCase().
 It then compares the results of both methods
 to verify whether they produce the same output.
 The program demonstrates string manipulation,
 loops, conditional checks, and method comparison in Java.
*/

package CoreProgramming.stringfunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class LowerCase {

    public static String manual(String text) {

        String result = " "; // initializes result string

        // iterates through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // gets character at current index

            // checks if character is an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // converts uppercase to lowercase using ASCII value
            }

            result += ch; // appends character to result string
        }
        return result; // returns manually converted lowercase string
    }

    public static String inBuilt(String text) {
        // converts string to lowercase using Java's built-in method
        return text.toLowerCase();
    }

    public static boolean check(String text1, String text2) {

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

        String text1 = manual(text); // converts string to lowercase manually
        String text2 = inBuilt(text); // converts string to lowercase using inbuilt method

        System.out.println("Lower case by manual method: " + text1); // displays manual result
        System.out.println("Lower case by inbuilt method: " + text2); // displays inbuilt result

        if (check(text1, text2)) {
            System.out.println("\nThe lower case string provided by both the methods are the same.");
        } else {
            System.out.println("\nThe lower case string provided by both the methods are not the same.");
        }
    }
}
