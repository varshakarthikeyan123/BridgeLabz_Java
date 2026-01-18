/*
 This program finds the largest number among three integers entered by the user.
 It demonstrates:
 - User input using Scanner
 - Conditional statements (if–else if–else)
 - Comparison of multiple values
*/
package CoreProgramming.ExtrasBuiltIn;
// Package declaration for extra built-in programs

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class LargestNumber {
    // Class to determine the largest of three numbers

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        // Reading the first number from the user

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        // Reading the second number from the user

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        // Reading the third number from the user

        // Checking if the first number is greater than the other two
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number " + number1 + " the largest? Yes");
            // Printing result if the first number is the largest
        }
        // Checking if the second number is greater than the other two
        else if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number " + number2 + " the largest? Yes");
            // Printing result if the second number is the largest
        }
        // Checking if the third number is greater than the other two
        else if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number " + number3 + " the largest? Yes");
            // Printing result if the third number is the largest
        }
        // This block executes when two or more numbers are equal
        else {
            System.out.println("Out of the three entered numbers more than one number are equal.");
            // Printing message when there is no single largest number
        }
    }
}
