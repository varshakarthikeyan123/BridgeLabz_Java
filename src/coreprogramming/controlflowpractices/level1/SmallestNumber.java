/*
 This program finds the smallest number among three integers.
 It takes three numbers as input from the user,
 compares them using conditional statements,
 and prints which one is the smallest.
*/
package CoreProgramming.controlflowpractices.level1;
// Package declaration for control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SmallestNumber {
    // Main class definition

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter first number: ");
        // Prompting user to enter the first number
        int number1 = sc.nextInt();
        // Reading the first number

        System.out.print("Enter second number: ");
        // Prompting user to enter the second number
        int number2 = sc.nextInt();
        // Reading the second number

        System.out.print("Enter third number: ");
        // Prompting user to enter the third number
        int number3 = sc.nextInt();
        // Reading the third number

        // Checking if the first number is the smallest among the three
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number " + number1 + " the smallest? Yes");
            // Printed when first number is the smallest
        }
        // Checking if the second number is the smallest among the three
        else if (number2 < number1 && number2 < number3) {
            System.out.println("Is the second number " + number2 + " the smallest? Yes");
            // Printed when second number is the smallest
        }
        // Checking if the third number is the smallest among the three
        else if (number3 < number1 && number3 < number2) {
            System.out.println("Is the third number " + number3 + " the smallest? Yes");
            // Printed when third number is the smallest
        }
        // This case occurs when two or more numbers are equal
        else {
            System.out.println("Out of the three entered numbers more than one number are equal.");
            // Printed when no single smallest number exists
        }
    }
}
