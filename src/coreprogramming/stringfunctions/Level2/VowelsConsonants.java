/*
 This program counts the number of vowels and consonants
 present in a given string entered by the user.
 It converts the string to lowercase to simplify
 character comparison.
 The program demonstrates string traversal,
 conditional checks, array return values,
 and basic counting logic in Java.
*/

package coreprogramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class VowelsConsonants {

    public static int[] vowelConsonants(String text) {

        int vowels = 0; // counter for vowels
        int consonants = 0; // counter for consonants

        String lower = text.toLowerCase(); // converts string to lowercase

        // iterates through each character in the string
        for (int i = 0; i < lower.length(); i++) {

            char ch = lower.charAt(i); // gets character at current index

            // checks if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++; // increments vowel count
            }
            // checks if character is an alphabet (consonant)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++; // increments consonant count
            }
        }

        return new int[]{vowels, consonants}; // returns counts as an array
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner scan = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String text = scan.nextLine(); // reads input string

        int[] count = vowelConsonants(text); // gets vowel and consonant counts

        System.out.println(
                "The count of vowels in the string: " + count[0]
        ); // displays vowel count

        System.out.println(
                "The count of consonants in the string: " + count[1]
        ); // displays consonant count
    }
}
