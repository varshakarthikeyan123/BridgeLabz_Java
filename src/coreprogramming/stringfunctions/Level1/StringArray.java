/*
 This program converts a given string into a character array
 using two different approaches:
 1) Manually converting the string using charAt().
 2) Using Java’s inbuilt toCharArray() method.
 It then compares both character arrays to check
 whether they are equal.
 The program demonstrates string manipulation,
 arrays, loops, and comparison logic in Java.
*/

package CoreProgramming.stringfunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class StringArray {

    public static char[] stringArrayCheck(String text) {

        char[] array = new char[text.length()]; // creates a character array of string length

        // converts string to char array manually
        for (int i = 0; i < text.length(); i++) {
            array[i] = text.charAt(i); // assigns each character to array
        }
        return array; // returns manually created character array
    }

    public static char[] stringArrayCheck2(String text) {

        char[] charArray = text.toCharArray(); // converts string to char array using inbuilt method
        return charArray; // returns character array
    }

    public static boolean stringArrayResult(char[] array, char[] array2) {

        // checks if both arrays have the same length
        if (array.length != array2.length) {
            System.out.println("Does not have the same length.");
            return false;
        }

        // compares each element of both arrays
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true; // returns true if both arrays are equal
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner scan = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter String: "); // prompts user to enter a string
        String text = scan.nextLine(); // reads input string

        char[] array1 = stringArrayCheck(text); // converts string using manual method
        char[] array2 = stringArrayCheck2(text); // converts string using inbuilt method

        System.out.println("The array by method1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " "); // prints each character from first array
        }

        System.out.println("\nThe array by method2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " "); // prints each character from second array
        }

        if (stringArrayResult(array1, array2)) { // compares both arrays
            System.out.println("\nBoth arrays are equal.");
        } else {
            System.out.println("\nBoth arrays are not equal.");
        }
    }
}
