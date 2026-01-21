/*
 This program checks whether a given integer number is
 positive, negative, or zero. It uses a separate method
 to perform the check and prints the result to the console.
*/
package coreprogramming.javamethods.level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class IntegerNumber {

    // Method to check whether the number is positive, negative, or zero
    public static void integerNum(int number) {

        // Checking if the number is greater than zero
        if (number > 0) {
            System.out.println("The number entered is positive.");
            // Printing message for positive number
        }
        // Checking if the number is less than zero
        else if (number < 0) {
            System.out.println("The number entered is negative.");
            // Printing message for negative number
        }
        // Executed when the number is zero
        else {
            System.out.println("The number entered is zero.");
            // Printing message for zero
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        // Prompting the user to enter a number

        int number = input.nextInt();
        // Reading the integer value entered by the user

        integerNum(number);
        // Calling the method to check the type of number
    }
}
