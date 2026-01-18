/*
 This program demonstrates how an IllegalArgumentException
 can occur while working with String methods in Java.
 It shows two approaches:
 1) A method that throws an exception without handling it.
 2) A method that handles the exception using try-catch.
 The program helps understand exception generation
 and exception handling in Java.
*/

package CoreProgramming.StringFunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class ArgumentException {

    public static void exceptionMethod(String text) {
        // attempts to extract a substring using invalid indices
        String result = text.substring(5, 2); // start index is greater than end index
        System.out.println(result); // this line will not execute due to exception
    }

    public static void handleException(String text) {

        try {
            // attempts the same invalid substring operation inside try block
            String result = text.substring(5, 2);
            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
            // handles the specific IllegalArgumentException
            System.out.println("Exception caught: IllegalArgumentException");
            System.out.println("Start index cannot be greater than end index");
        }
        catch (RuntimeException e) {
            // handles any other runtime exceptions
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter the string: "); // prompts user to enter a string
        String text = input.nextLine(); // reads input string

        exceptionMethod(text); // calls method that throws exception without handling
        handleException(text); // calls method that handles the exception safely
    }
}
