/*
 This program generates the FizzBuzz sequence up to a given number.
 It stores the result in a String array and displays each position
 along with the final FizzBuzz array.
*/
package coreprogramming.arraypractice.level1; // Defines the package for this program

import java.util.Scanner; // Scanner class is used to take input from the user

public class FizzBuzz { // Defines the main class
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read input values

        System.out.print("Enter a number: "); // Prompts user to enter a number
        int number = input.nextInt(); // Reads the number up to which FizzBuzz is generated

        String[] fizzBuzz = new String[number + 1]; // Creates a String array of size number + 1

        // Loop to generate FizzBuzz values from 1 to number
        for (int i = 1; i <= number; i++) { // Iterates from 1 to number

            // Checking if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) { // Condition for FizzBuzz
                fizzBuzz[i] = "FizzBuzz"; // Stores "FizzBuzz"
            }
            // Checking if the number is divisible only by 3
            else if (i % 3 == 0) { // Condition for Fizz
                fizzBuzz[i] = "Fizz"; // Stores "Fizz"
            }
            // Checking if the number is divisible only by 5
            else if (i % 5 == 0) { // Condition for Buzz
                fizzBuzz[i] = "Buzz"; // Stores "Buzz"
            }
            // If the number is not divisible by 3 or 5
            else {
                fizzBuzz[i] = String.valueOf(i); // Converts number to String and stores it
            }
        }

        System.out.print("The result is: "); // Prints message before displaying positions

        // Loop to display each position with its corresponding value
        for (int i = 1; i <= number; i++) { // Iterates through the array
            System.out.println("Position " + i + " = " + fizzBuzz[i]); // Prints index and value
        }

        System.out.print("The result array is: "); // Prints message before displaying array

        // Loop to display the final FizzBuzz array values
        for (int i = 1; i <= number; i++) { // Iterates through the array
            System.out.print(fizzBuzz[i] + " "); // Prints each FizzBuzz value
        }
    }
}
