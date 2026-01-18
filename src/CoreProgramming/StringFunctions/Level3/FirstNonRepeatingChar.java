/*
 This program finds the first non-repeating character
 in a given string.
 It calculates the string length without using the
 built-in length() method, counts the frequency of
 each character using an ASCII-based array, and then
 scans the string to identify the first character
 that appears only once.
 The program demonstrates string traversal,
 arrays, exception handling, and conditional logic in Java.
*/

package CoreProgramming.StringFunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeating(String str) {

        int[] freq = new int[256]; // stores frequency of ASCII characters
        int length = 0; // counter for string length

        try {
            // calculates string length without using length()
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // exception occurs when index exceeds string length
        }

        // counts frequency of each character
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i); // gets character at index
            freq[(int) ch]++; // increments frequency using ASCII value
        }

        // finds the first character with frequency 1
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (freq[(int) ch] == 1) {
                return ch; // returns first non-repeating character
            }
        }

        return '\0'; // returns null character if no unique character is found
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String input = sc.nextLine(); // reads input string

        char result = findFirstNonRepeating(input); // finds first non-repeating character

        if (result != '\0') {
            System.out.println(
                    "First non-repeating character: " + result
            ); // displays the result
        } else {
            System.out.println(
                    "No non-repeating character found."
            ); // displays message if none found
        }
    }
}
