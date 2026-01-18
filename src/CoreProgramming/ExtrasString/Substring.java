/*
 This program finds how many times a substring
 occurs within a given string.
*/
package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Substring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the main string

        System.out.print("Enter the substring to search: ");
        String substring = input.nextLine();
        // Reading the substring to be searched

        int count = 0;
        // Variable to count occurrences of the substring

        int index = 0;
        // Index to track the current position in the string

        // Loop to find all occurrences of the substring
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
            // Move index forward after each match
        }

        // Displaying the result
        System.out.println("Occurrence of substring: " + count);
    }
}
