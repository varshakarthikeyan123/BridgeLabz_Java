/*
 This program finds the length of a given string
 using two different approaches:
 1) A custom method that calculates length without
    using the built-in length() method, by accessing
    characters until an exception occurs.
 2) Using Java’s in-built length() method.
 The program helps understand how string length
 can be determined internally.
*/

package CoreProgramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class StringLength {

    public static int stringLen(String text) {

        int count = 0; // counter to store string length

        try {
            // keeps accessing characters until index goes out of bounds
            while (true) {
                text.charAt(count); // accesses character at current index
                count++; // increments counter
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            // exception occurs when index exceeds string length
        }

        return count; // returns calculated string length
    }

    public static int stringLen2(String text) {
        // returns string length using built-in method
        return text.length();
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String text = input.nextLine(); // reads input string

        int result1 = stringLen(text); // calculates length without using in-built method
        int result2 = stringLen2(text); // calculates length using in-built method

        System.out.println(
                "The length of string without using in-built method: " + result1
        ); // displays custom method result

        System.out.println(
                "The length of string by using in-built method: " + result2
        ); // displays in-built method result
    }
}
