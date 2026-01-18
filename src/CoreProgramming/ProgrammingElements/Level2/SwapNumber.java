/*
 This program swaps two numbers entered by the user
 using a temporary variable.
 It demonstrates the concept of swapping values,
 use of a helper variable, and output in Java.
 The program shows both original and swapped values.
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class SwapNumber {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter number (number1): "); // prompts user to enter first number
        int number1 = input.nextInt(); // reads first number

        System.out.print("Enter number (number2): "); // prompts user to enter second number
        int number2 = input.nextInt(); // reads second number

        System.out.println("Original (number1): " + number1); // displays original first number
        System.out.println("Original (number2): " + number2); // displays original second number

        int temp = number1; // stores value of number1 in a temporary variable
        number1 = number2; // assigns value of number2 to number1
        number2 = temp; // assigns stored value back to number2

        System.out.println(
                "The swapped numbers are " + number1 + " and " + number2 + "."
        ); // displays swapped values
    }
}
