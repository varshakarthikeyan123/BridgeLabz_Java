/*
 This program calculates the frequency of each unique
 character present in a given string.
 It follows a step-by-step approach:
 1) Finds the length of the string without using length().
 2) Extracts only unique characters from the string.
 3) Counts the frequency of each unique character.
 4) Displays the result in a formatted table.
 The program demonstrates string traversal,
 nested loops, arrays, exception handling,
 and character frequency logic in Java.
*/

package CoreProgramming.stringfunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class CharFrequencyUsingUnique {

    public static int stringLength(String str) {

        int len = 0; // counter for string length

        try {
            // accesses characters until index goes out of bounds
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
            // exception occurs when index exceeds string length
        }

        return len; // returns calculated length
    }

    public static char[] uniqueCharacters(String str) {

        int len = stringLength(str); // gets string length
        char[] temp = new char[len]; // temporary array to store unique characters
        int count = 0; // counts number of unique characters

        // finds unique characters
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i); // gets current character
            boolean isUnique = true; // flag to check uniqueness

            for (int j = 0; j < count; j++) {
                if (temp[j] == ch) {
                    isUnique = false; // character already exists
                    break;
                }
            }

            if (isUnique) {
                temp[count] = ch; // stores unique character
                count++;
            }
        }

        char[] unique = new char[count]; // array with exact size

        // copies unique characters to final array
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique; // returns array of unique characters
    }

    public static String[][] findFrequency(String str) {

        int[] freq = new int[256]; // frequency array for ASCII characters
        int len = stringLength(str); // gets string length

        // counts frequency of each character
        for (int i = 0; i < len; i++) {
            freq[(int) str.charAt(i)]++; // increments frequency using ASCII value
        }

        char[] unique = uniqueCharacters(str); // gets unique characters

        String[][] result = new String[unique.length][2]; // stores character and frequency

        // prepares final result table
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = Character.toString(unique[i]); // stores character
            result[i][1] = Integer.toString(freq[(int) unique[i]]); // stores frequency
        }

        return result; // returns frequency table
    }

    public static void display(String[][] data) {

        System.out.printf("%-10s %-10s%n", "Character", "Frequency"); // table header

        // displays each character and its frequency
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String input = sc.nextLine(); // reads input string

        String[][] frequencyData = findFrequency(input); // calculates character frequency
        display(frequencyData); // displays frequency table
    }
}
