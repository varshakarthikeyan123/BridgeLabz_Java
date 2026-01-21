/*
 This program extracts a substring from a given string
 using two different approaches:
 1) A manual method that builds the substring character by character.
 2) Java’s inbuilt substring() method.
 It then compares the results from both methods to
 verify correctness.
 The program demonstrates string manipulation,
 index validation, loops, and method comparison in Java.
*/

package coreprogramming.stringfunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class SubString {

    public static String checkSubString(String text, int start, int end) {

        // checks for invalid index values
        if (start < 0 || end > text.length() || start >= end) {
            return "Invalid index values";
        }

        String result = ""; // initializes empty string to store substring

        // builds substring manually using loop
        for (int i = start; i < end; i++) {
            result += text.charAt(i); // appends character to result
        }

        return result; // returns manually created substring
    }

    public static String checkSubString2(String text, int start, int end) {
        // returns substring using inbuilt Java method
        return text.substring(start, end);
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner inout = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter the string: "); // prompts user to enter a string
        String text = inout.nextLine(); // reads input string

        System.out.print("Enter the starting index for the substring: "); // prompts user for start index
        int start = inout.nextInt(); // reads starting index

        System.out.print("Enter the ending index for the substring: "); // prompts user for end index
        int end = inout.nextInt(); // reads ending index

        String check1 = checkSubString(text, start, end); // gets substring using manual method
        String check2 = checkSubString2(text, start, end); // gets substring using inbuilt method

        System.out.println("Substring from method 1: " + check1); // displays manual substring
        System.out.println("Substring from method 2: " + check2); // displays inbuilt substring

        if (check1.equals(check2)) { // compares results from both methods
            System.out.println("The substrings from both methods are correct.");
        } else {
            System.out.println("The substrings are not from the correct methods.");
        }
    }
}
