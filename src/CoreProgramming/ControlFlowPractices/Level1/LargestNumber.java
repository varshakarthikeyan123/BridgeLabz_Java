/*
 This program finds the largest among three numbers entered by the user.
 It uses conditional statements to compare the three values and
 prints which number is the largest or if multiple numbers are equal.
*/
package CoreProgramming.ControlFlowPractices.Level1; // Defines the package for control flow practice programs

import java.util.Scanner; // Imports Scanner class to take input from the user

public class LargestNumber { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creating Scanner object to read user input

        System.out.print("Enter first number: "); // Prompting user for the first number
        int number1 = sc.nextInt(); // Reading the first number

        System.out.print("Enter second number: "); // Prompting user for the second number
        int number2 = sc.nextInt(); // Reading the second number

        System.out.print("Enter third number: "); // Prompting user for the third number
        int number3 = sc.nextInt(); // Reading the third number

        // Checking if the first number is greater than the other two
        if (number1 > number2 && number1 > number3) { // Condition to check if number1 is the largest
            System.out.println("Is the first number " + number1 + " the largest? Yes"); // Prints result
        }
        // Checking if the second number is greater than the other two
        else if (number2 > number1 && number2 > number3) { // Condition to check if number2 is the largest
            System.out.println("Is the second number " + number2 + " the largest? Yes"); // Prints result
        }
        // Checking if the third number is greater than the other two
        else if (number3 > number1 && number3 > number2) { // Condition to check if number3 is the largest
            System.out.println("Is the third number " + number3 + " the largest? Yes"); // Prints result
        }
        // Executes when two or more numbers are equal
        else {
            System.out.println("Out of the three entered numbers more than one number are equal."); // Prints equality message
        }
    }
}
