/*
 This program calculates the power of a number.
 It takes a base value and an exponent from the user
 and uses Math.pow() to compute the result.
*/
package coreprogramming.practiceproblems.selfproblem;

import java.util.Scanner; // Importing Scanner class to take user input

public class Power {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creating Scanner object for input

        System.out.print("Enter the base number: ");
        double base = input.nextDouble(); // Reading base value

        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble(); // Reading exponent value

        double powerNumber = Math.pow(base, exponent); // Calculating base raised to exponent

        System.out.println("Power of the given number is: " + powerNumber); // Displaying result
    }
}
