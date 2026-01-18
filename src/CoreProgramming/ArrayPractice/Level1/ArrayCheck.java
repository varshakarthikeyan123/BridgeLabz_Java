/*
 This program works with a one-dimensional array.
 It takes 5 integers as input, displays them,
 checks whether each number is positive, negative, or zero,
 checks even or odd for positive numbers,
 and finally compares the first and last elements of the array.
*/
package CoreProgramming.ArrayPractice.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take input from the user

public class ArrayCheck { // Defines the main class
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creates Scanner object to read user input

        System.out.print("Enter array of numbers: "); // Prompts user to enter numbers

        int[] number = new int[5]; // Declares an integer array of size 5

        // Loop to take 5 numbers as input and store them in the array
        for (int i = 0; i < 5; i++) { // Loops 5 times
            number[i] = input.nextInt(); // Reads and stores each number in the array
        }

        System.out.print("Array of numbers are: "); // Prints message before displaying array

        // Loop to display the elements of the array
        for (int i = 0; i < 5; i++) { // Loops through the array
            System.out.println(number[i] + " "); // Prints each array element
        }

        // Loop to check whether each number is positive, negative, or zero
        // Also checks even or odd for positive numbers
        for (int i = 0; i < number.length; i++) { // Loops through the array

            if (number[i] > 0) { // Checks if number is positive
                System.out.println(number[i] + " is Positive."); // Prints positive message

                // Checking if the positive number is even or odd
                if (number[i] % 2 == 0) { // Checks if number is even
                    System.out.println(number[i] + " is even."); // Prints even message
                } else { // Executes if number is odd
                    System.out.println(number[i] + " is odd."); // Prints odd message
                }
            }
            else if (number[i] < 0) { // Checks if number is negative
                System.out.println(number[i] + " is Negative."); // Prints negative message
            }
            else { // Executes if number is zero
                System.out.println(number[i] + " is Zero."); // Prints zero message
            }
        }

        // Loop used to compare first and last elements of the array
        // break is used because comparison is needed only once
        for (int i = 1; i < number.length; i++) { // Loop runs once due to break

            if (number[0] > number[number.length - 1]) { // Checks if first element is greater
                System.out.println(number[0] + " is largest."); // Prints largest message
                break; // Exits loop
            }
            else if (number[0] < number[number.length - 1]) { // Checks if first element is smaller
                System.out.println(number[0] + " is smallest."); // Prints smallest message
                break; // Exits loop
            }
            else { // Executes if both elements are equal
                System.out.println(number[0] + " and " + number[number.length - 1] + " are equal."); // Prints equality message
                break; // Exits loop
            }
        }
    }
}
