/*
 This program checks each character of a given string
 and determines whether it is a vowel, consonant,
 or not a letter.
 It handles both uppercase and lowercase letters
 by converting uppercase letters to lowercase.
 The program then displays the result in a table format.
 It demonstrates character handling, ASCII conversion,
 conditional logic, arrays, and formatted output in Java.
*/

package CoreProgramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class VowelConsonantChecker {

    public static String checkCharacterType(char ch) {

        // converts uppercase letter to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // checks if character is a lowercase alphabet
        if (ch >= 'a' && ch <= 'z') {

            // checks if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter"; // returns if character is not an alphabet
    }

    public static String[][] findVowelsAndConsonants(String text) {

        String[][] result = new String[text.length()][2]; // stores character and its type

        // checks each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // gets character at index
            result[i][0] = String.valueOf(ch); // stores character
            result[i][1] = checkCharacterType(ch); // determines character type
        }

        return result; // returns result table
    }

    public static void displayTable(String[][] data) {

        System.out.println("\nCharacter\tType");

        // displays character and its classification
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String input = sc.nextLine(); // reads input string

        String[][] result = findVowelsAndConsonants(input); // analyzes characters
        displayTable(result); // displays the final table
    }
}
