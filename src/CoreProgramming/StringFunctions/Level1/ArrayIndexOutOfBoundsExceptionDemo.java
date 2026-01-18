/*
 This program demonstrates how an
 ArrayIndexOutOfBoundsException occurs in Java.
 It shows two scenarios:
 1) Generating the exception without handling it.
 2) Handling the exception using try-catch blocks.
 The program helps understand array bounds,
 exception causes, and proper exception handling.
*/

package CoreProgramming.StringFunctions.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateException(String[] names) {
        // intentionally accesses an invalid array index
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        String name = names[names.length]; // index equals length is out of bounds
        System.out.println(name); // this line will not execute due to exception
    }

    public static void handleException(String[] names) {

        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");

        try {
            // attempts to access an invalid array index inside try block
            String name = names[names.length];
            System.out.println(name);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // handles the specific ArrayIndexOutOfBoundsException
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
            System.out.println("Array index accessed is out of range");
        }
        catch (RuntimeException e) {
            // handles any other runtime exception
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner scan = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter number of names: "); // prompts user to enter array size
        int size = scan.nextInt(); // reads number of names
        scan.nextLine(); // clears the newline character

        String[] names = new String[size]; // creates string array of given size

        System.out.print("Enter the names: "); // prompts user to enter names
        for (int i = 0; i < size; i++) {
            names[i] = scan.nextLine(); // stores each name in the array
        }

        generateException(names); // calls method that generates exception
        handleException(names); // calls method that handles the exception
    }
}
