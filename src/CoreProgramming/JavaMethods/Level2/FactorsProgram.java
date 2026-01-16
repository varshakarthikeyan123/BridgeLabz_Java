package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FactorsProgram {

    // Method to find all factors of a given number
    public static int[] findFactors(int number) {

        int count = 0;
        // Variable to count how many factors the number has

        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        // Creating array to store all factors

        int index = 0;
        // Index to insert factors into the array

        // Second loop to store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
        // Returning the array of factors
    }

    // Method to calculate sum of all factors
    public static int sumOfFactors(int[] factors) {

        int sum = 0;
        // Variable to store sum of factors

        for (int value : factors) {
            sum += value;
        }

        return sum;
        // Returning sum of factors
    }

    // Method to calculate product of all factors
    public static long productOfFactors(int[] factors) {

        long product = 1;
        // Variable to store product of factors

        for (int value : factors) {
            product *= value;
        }

        return product;
        // Returning product of factors
    }

    // Method to calculate sum of squares of all factors
    public static double sumOfSquares(int[] factors) {

        double sum = 0;
        // Variable to store sum of squares

        for (int value : factors) {
            sum += Math.pow(value, 2);
        }

        return sum;
        // Returning sum of squares of factors
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number

        // Checking if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[] factors = findFactors(number);
        // Calling method to find factors

        System.out.println("Factors of " + number + ":");
        // Printing all factors
        for (int value : factors) {
            System.out.print(value + " ");
        }

        // Printing sum, product, and sum of squares of factors
        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
