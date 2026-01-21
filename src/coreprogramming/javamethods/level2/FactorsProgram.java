/*
 This program takes a positive integer as input and:
 1) Finds all its factors
 2) Stores the factors in an array
 3) Calculates the sum of factors
 4) Calculates the product of factors
 5) Calculates the sum of squares of factors
*/
package coreprogramming.javamethods.level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FactorsProgram {

    // Method to find all factors of a given number
    public static int[] findFactors(int number) {

        int count = 0;
        // Variable to count the total number of factors

        // Loop to count how many factors the number has
        for (int i = 1; i <= number; i++) {
            // Checking each number from 1 to number
            if (number % i == 0) {
                // If i divides number completely
                count++;
                // Incrementing factor count
            }
        }

        int[] factors = new int[count];
        // Creating an array to store all factors

        int index = 0;
        // Index to track position in factors array

        // Loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            // Checking each possible factor again
            if (number % i == 0) {
                // If i is a factor
                factors[index] = i;
                // Storing factor in array
                index++;
                // Moving to next index
            }
        }

        return factors;
        // Returning the array containing all factors
    }

    // Method to calculate the sum of all factors
    public static int sumOfFactors(int[] factors) {

        int sum = 0;
        // Variable to store sum of factors

        // Loop through each factor
        for (int value : factors) {
            sum += value;
            // Adding current factor to sum
        }

        return sum;
        // Returning sum of factors
    }

    // Method to calculate the product of all factors
    public static long productOfFactors(int[] factors) {

        long product = 1;
        // Variable to store product of factors

        // Loop through each factor
        for (int value : factors) {
            product *= value;
            // Multiplying factor with product
        }

        return product;
        // Returning product of factors
    }

    // Method to calculate the sum of squares of all factors
    public static double sumOfSquares(int[] factors) {

        double sum = 0;
        // Variable to store sum of squares

        // Loop through each factor
        for (int value : factors) {
            sum += Math.pow(value, 2);
            // Adding square of factor to sum
        }

        return sum;
        // Returning sum of squares
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting user for input
        int number = input.nextInt();
        // Reading the number entered by the user

        // Checking if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            // Displaying error message for invalid input
            return;
            // Exiting the program
        }

        int[] factors = findFactors(number);
        // Calling method to find all factors

        System.out.println("Factors of " + number + ":");
        // Printing heading for factors list

        // Loop to print all factors
        for (int value : factors) {
            System.out.print(value + " ");
            // Printing each factor
        }

        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        // Printing sum of factors

        System.out.println("Product of factors: " + productOfFactors(factors));
        // Printing product of factors

        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        // Printing sum of squares of factors
    }
}
