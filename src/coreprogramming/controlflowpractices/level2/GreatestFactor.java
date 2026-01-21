/*
 This program finds the greatest factor of a given number
 excluding the number itself.
 It checks all possible factors starting from (number - 1)
 and stops as soon as the largest factor is found.
*/
package coreprogramming.controlflowpractices.level2;
// Package declaration for Level 2 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class GreatestFactor {
    // Main class definition

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting user to enter a number
        int number = input.nextInt();
        // Reading the number for which the greatest factor is to be found

        int greatestFactor = 1;
        // Initializing greatest factor as 1
        // 1 is a factor of every integer

        // Loop starts from (number - 1) and goes down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Checking if the current value divides the number completely
            if (number % i == 0) {
                greatestFactor = i;
                // Assigning the first (largest) factor found
                break;
                // Breaking because we want the greatest factor less than the number
            }
        }

        System.out.println("Greatest factor: " + greatestFactor);
        // Displaying the greatest factor of the number
    }
}
