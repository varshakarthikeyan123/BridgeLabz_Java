/*
 This program demonstrates how a NumberFormatException
 occurs in Java when trying to convert a non-numeric
 string into an integer.
 It shows two scenarios:
 1) Generating the exception without handling it.
 2) Handling the exception using try-catch blocks.
 The program helps understand type conversion,
 exception causes, and proper exception handling in Java.
*/

package CoreProgramming.StringFunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class NumberFormatExceptionDemo {

    public static void generateException(String text) {

        System.out.println("\nGenerating NumberFormatException...");
        int number = Integer.parseInt(text); // attempts to convert string to integer
        System.out.println("Number: " + number); // this line executes only if conversion succeeds
    }

    public static void handleException(String text) {

        System.out.println("\nHandling NumberFormatException...");

        try {
            int number = Integer.parseInt(text); // attempts string to integer conversion
            System.out.println("Number: " + number);
        }
        catch (NumberFormatException e) {
            // handles NumberFormatException
            System.out.println("Exception caught: NumberFormatException");
            System.out.println("Input text does not contain a valid number");
        }
        catch (RuntimeException e) {
            // handles any other runtime exception
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner scan = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter a string: "); // prompts user to enter a string
        String text = scan.nextLine(); // reads input string

        generateException(text); // calls method that generates exception
        handleException(text); // calls method that handles the exception
    }
}
