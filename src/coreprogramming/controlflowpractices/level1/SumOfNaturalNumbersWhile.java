/*
 This program calculates the sum of the first n natural numbers.
 It first checks whether the given number is a valid natural number.
 The sum is calculated using the formula n*(n+1)/2.
 The program then uses while loops to compare the number with the sum.
*/
package coreprogramming.controlflowpractices.level1;
// Package declaration for control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SumOfNaturalNumbersWhile {
    // Main class definition

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        // Prompting user to enter a number
        int number = input.nextInt();
        // Reading the number from the user

        // Checking whether the entered number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
            // Printing error message for invalid natural number
            return;
            // Exits the program if the number is not natural
        }

        int sum = 0;
        // Variable to store the sum of natural numbers

        // Loop to calculate the sum of first 'number' natural numbers
        for (int i = 1; i <= number; i++) {
            sum = number * (number + 1) / 2;
            // Formula to calculate sum of first n natural numbers
        }

        System.out.println("The sum of " + number + " natural numbers is " + sum + ".");
        // Displaying the calculated sum

        // while loop executes if the number is equal to the calculated sum
        while (number == sum) {
            System.out.println("The number is equal to the sum of " + number + " numbers");
            // Printed when number equals the sum
            break;
            // Breaking to avoid infinite loop
        }

        // while loop executes if the number is not equal to the calculated sum
        while (number != sum) {
            System.out.println("The number is not equal to the sum of " + number + " numbers");
            // Printed when number does not equal the sum
            break;
            // Breaking to avoid infinite loop
        }
    }
}
