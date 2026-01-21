/*
 This program keeps accepting numbers from the user
 and adds them to a running total.
 The loop continues until the user enters zero or a negative number.
 Finally, the program displays the total sum before termination.
*/
package CoreProgramming.controlflowpractices.level1;
// Package declaration for control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SumToZero {
    // Main class definition

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        // Prompting user to enter the first number
        double value = input.nextDouble();
        // Reading the first number from the user

        double total = 0.0;
        // Variable to store the running sum of entered numbers

        // Loop continues as long as the entered number is positive
        while (value > 0) {

            total = total + value;
            // Adding the current value to the total sum

            System.out.println("The sum is: " + total);
            // Displaying the updated sum after each input

            System.out.print("Enter number: ");
            // Prompting user to enter the next number
            value = input.nextDouble();
            // Reading the next number
        }

        System.out.println("The sum achieved before reaching zeros is: " + total);
        // Displaying the final sum before the loop ends

        System.out.println("The user has entered zero");
        // Informing the reason why the loop stopped
    }
}
