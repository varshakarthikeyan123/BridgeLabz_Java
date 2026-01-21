/*
 This program calculates the quotient and remainder
 of two numbers entered by the user.
 It demonstrates division and modulus operations
 using floating-point numbers.
 The program also shows how quotient and remainder
 can be obtained from two given values.
*/

package CoreProgramming.programmingelements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class QuotientReminder {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter first number: "); // prompts user for first number
        float number1 = input.nextFloat(); // reads first number

        System.out.print("Enter second number: "); // prompts user for second number
        float number2 = input.nextFloat(); // reads second number

        float quotient = number1 / number2; // calculates quotient using division
        float remainder = number1 % number2; // calculates remainder using modulus operator

        System.out.println(
                "The quotient is " + quotient
                        + " and remainder is " + remainder
                        + " of two numbers " + number1 + " and " + number2
        ); // displays quotient and remainder
    }
}
