/*
 This program separates odd and even numbers up to a given natural number.
 It validates the input, stores odd and even numbers in separate arrays,
 and then displays both lists.
*/
package coreprogramming.arraypractice.level1; // Defines the package for array practice programs (Level 1)

import java.util.Scanner; // Scanner class is used to take input from the user

public class OddEvenArray { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read input

        System.out.print("Enter a natural number: "); // Prompts user to enter a natural number
        int number = input.nextInt(); // Reads a natural number from the user

        // Checking if the entered number is a valid natural number
        if (number <= 0) { // Condition to validate natural number
            System.out.println("Error: Please enter a natural number."); // Displays error message
            return; // Exits the program if input is invalid
        }

        int[] even = new int[number / 2 + 1]; // Array to store even numbers up to the given number

        int[] odd = new int[number / 2 + 1]; // Array to store odd numbers up to the given number

        int evenIndex = 0; // Keeps track of the current index for even array

        int oddIndex = 0; // Keeps track of the current index for odd array

        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) { // Iterates through all numbers up to input

            // Checking whether the number is even or odd
            if (i % 2 == 0) { // Condition to check even number
                even[evenIndex] = i; // Stores even number in even array
                evenIndex++; // Moves to the next index in even array
            } else { // Executes if number is odd
                odd[oddIndex] = i; // Stores odd number in odd array
                oddIndex++; // Moves to the next index in odd array
            }
        }

        System.out.println("\nOdd numbers:"); // Prints heading for odd numbers

        // Loop to display all stored odd numbers
        for (int i = 0; i < oddIndex; i++) { // Iterates through odd array
            System.out.print(odd[i] + " "); // Prints each odd number
        }

        System.out.println("\n\nEven numbers:"); // Prints heading for even numbers

        // Loop to display all stored even numbers
        for (int i = 0; i < evenIndex; i++) { // Iterates through even array
            System.out.print(even[i] + " "); // Prints each even number
        }
    }
}
