/*
 This program acts as a simple calculator.
 It takes two numbers from the user and
 performs basic arithmetic operations:
 addition, subtraction, multiplication,
 and division.
 The program demonstrates user input,
 arithmetic operators, and formatted output.
*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner; // imports Scanner class for taking user input

public class Calculator {

    public static void main(String[] args) { // main method where execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object to read input

        System.out.print("Enter first number: "); // prompts user for first number
        float num1 = input.nextFloat(); // reads first number

        System.out.print("Enter second number: "); // prompts user for second number
        float num2 = input.nextFloat(); // reads second number

        float addition = num1 + num2; // performs addition
        float subtraction = num1 - num2; // performs subtraction
        float multiplication = num1 * num2; // performs multiplication
        float division = num1 / num2; // performs division

        System.out.println(
                "The addition, subtraction, multiplication and division values of 2 numbers "
                        + num1 + " and " + num2 + " is "
                        + addition + ", " + subtraction + ", " + multiplication + " and " + division
        ); // displays all calculated results
    }
}
