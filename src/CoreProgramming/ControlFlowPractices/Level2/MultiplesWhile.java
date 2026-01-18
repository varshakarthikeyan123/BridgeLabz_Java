/*
 This program checks and prints all the factors of a given number
 using a while loop.
 The number must be positive and less than or equal to 100.
*/
package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class MultiplesWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        // Loop to validate input so that number is positive and ≤ 100
        while (number > 100 || number < 0) {
            System.out.print("Enter a number less than 100 and should also be positive: ");
            number = input.nextInt();
            // Taking input again until valid number is entered
        }

        int counter = number - 1;
        // Initializing counter to one less than the given number

        // While loop to find and print all factors of the number
        while (counter > 1) {

            // Checking if counter is a factor of the number
            if (number % counter == 0) {
                System.out.println(counter);
                // Printing the factor
            }

            counter--;
            // Decreasing counter to check the next value
        }
    }
}
