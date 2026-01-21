/*
 This program calculates the frequency of each character
 present in a given string.
 It manually determines the string length without using
 the built-in length() method, counts character occurrences
 using an ASCII-based frequency array, and stores the
 results in a two-dimensional array.
 Finally, it displays each unique character along with
 its frequency in a formatted table.
 The program demonstrates string traversal, arrays,
 exception handling, and formatted output in Java.
*/

package CoreProgramming.stringfunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class CharacterFrequency {

    public static String[][] findCharFrequency(String str) {

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

        int uniqueCount = 0; // counts number of unique characters

        // counts how many unique characters are present
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2]; // stores character and its frequency
        int index = 0;

        // fills result array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i); // stores character
                result[index][1] = Integer.toString(freq[i]); // stores frequency
                index++;
            }
        }

        return result; // returns character frequency table
    }

    public static void displayFrequency(String[][] data) {

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

        String[][] freqData = findCharFrequency(input); // calculates character frequencies
        displayFrequency(freqData); // displays frequency table
    }
}
