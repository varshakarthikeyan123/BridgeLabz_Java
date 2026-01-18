/*
 This program calculates the frequency of each character
 in a given string using nested loops.
 It avoids using extra data structures like hash maps
 and instead marks already counted characters.
 The program demonstrates array manipulation,
 nested loops, character comparison,
 and frequency counting in Java.
*/

package CoreProgramming.StringFunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class CharFrequencyNestedLoops {

    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray(); // converts string to character array
        int n = chars.length; // stores length of the array
        int[] freq = new int[n]; // array to store frequency of characters

        // initializes frequency of each character as 1
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        // counts frequency using nested loops
        for (int i = 0; i < n; i++) {

            if (chars[i] == '0') { // skips already counted characters
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++; // increments frequency
                    chars[j] = '0'; // marks character as counted
                }
            }
        }

        int uniqueCount = 0; // counts unique characters

        // counts how many unique characters exist
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount]; // stores final character-frequency pairs
        int index = 0;

        // prepares the final result array
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i]; // formats output
                index++;
            }
        }

        return result; // returns frequency result
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String input = sc.nextLine(); // reads input string

        String[] frequency = findFrequency(input); // finds character frequencies

        System.out.println("Character Frequencies:");
        for (String s : frequency) {
            System.out.println(s); // displays frequency of each character
        }
    }
}
