/*
 This program calculates the sum of the first N natural numbers.
 It ensures the user enters a valid positive number,
 uses the mathematical formula n*(n+1)/2 to find the sum,
 and compares the result with the original number.
*/
package coreprogramming.controlflowpractices.level1; // Package for Level 1 control flow practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class CountingNumbers { // Main class
    public static void main(String[] args) { // Entry point of the program

        Scanner input = new Scanner(System.in); // Creating Scanner object to read input

        System.out.print("Enter number: "); // Prompting user to enter a number
        int number = input.nextInt(); // Reading the number from the user

        // Loop to ensure the number entered is greater than zero
        while (number <= 0) {
            System.out.print("Enter a number greater than zero: "); // Asking again for valid input
            number = input.nextInt(); // Reading corrected input
        }

        int sum = 0; // Variable to store the sum of first 'number' natural numbers

        // Loop used to calculate the sum using formula
        while (number > 0) {
            sum = number * (number + 1) / 2; // Formula for sum of first n natural numbers
            break; // Breaking because calculation is needed only once
        }

        System.out.println("The sum of " + number + " numbers is: " + sum + "."); // Displaying the sum

        // Checking whether the given number is equal to the calculated sum
        if (number == sum) {
            System.out.println("The number is equal to the sum of " + number + " numbers");
        }
        else {
            System.out.println("The number is not equal to the sum of " + number + " numbers");
        }
    }
}
