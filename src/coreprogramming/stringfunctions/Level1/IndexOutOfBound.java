/*
 This program demonstrates how a
 StringIndexOutOfBoundsException occurs in Java.
 It shows two scenarios:
 1) Generating the exception without handling it.
 2) Handling the exception using a try-catch block.
 The program helps understand string indexing
 and proper exception handling techniques.
*/

package coreprogramming.stringfunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class IndexOutOfBound {

    public static void exceptionMethod(String text) {

        // attempts to access a character at an invalid index
        char ch = text.charAt(text.length()); // valid indices are 0 to length-1
        System.out.println(ch); // this line will not execute due to exception
    }

    public static void handleException(String text) {

        try {
            // attempts the same invalid character access inside try block
            char ch = text.charAt(text.length());
            System.out.println(ch);
        }
        catch (StringIndexOutOfBoundsException e) {
            // handles StringIndexOutOfBoundsException
            System.out.println("Invalid index accessed");
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String text = input.nextLine(); // reads input string

        exceptionMethod(text); // calls method that generates exception
        handleException(text); // calls method that handles the exception
    }
}
