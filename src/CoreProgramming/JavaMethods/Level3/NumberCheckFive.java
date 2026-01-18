/*
 This program performs multiple number-related checks using methods.
 It finds factors of a number and checks whether the number is
 Perfect, Abundant, Deficient, and Strong.
*/
package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class NumberCheck5 {

    // Method to find all factors of a given number
    public static int[] findFactors(int number) {

        int count = 0;
        // Variable to count total number of factors

        // First loop to count how many factors the number has
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Array to store the factors
        int[] factors = new int[count];
        int index = 0;
        // Index to store factors in array

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
        // Returning the factors array
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {

        int max = factors[0];
        // Assume first factor is the greatest initially

        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
        // Returning the greatest factor
    }

    // Method to calculate the sum of all factors
    public static int sumOfFactors(int[] factors) {

        int sum = 0;
        // Variable to store sum of factors

        for (int f : factors) {
            sum += f;
        }
        return sum;
        // Returning sum of factors
    }

    // Method to calculate the product of all factors
    public static long productOfFactors(int[] factors) {

        long product = 1;
        // Variable to store product of factors

        for (int f : factors) {
            product *= f;
        }
        return product;
        // Returning product of factors
    }

    // Method to calculate the product of cubes of all factors
    public static double productOfCubeOfFactors(int[] factors) {

        double product = 1;
        // Variable to store product of cubes

        for (int f : factors) {
            product *= Math.pow(f, 3);
            // Cubing each factor and multiplying
        }
        return product;
        // Returning product of cubes
    }

    // Method to check whether the number is a Perfect Number
    public static boolean perfectNumber(int number, int[] factors) {

        int sum = 0;
        // Sum of proper divisors

        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum == number;
        // Perfect number if sum equals the number
    }

    // Method to check whether the number is an Abundant Number
    public static boolean abundantNumber(int number, int[] factors) {

        int sum = 0;
        // Sum of proper divisors

        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum > number;
        // Abundant number if sum is greater than the number
    }

    // Method to check whether the number is a Deficient Number
    public static boolean deficientNumber(int number, int[] factors) {

        int sum = 0;
        // Sum of proper divisors

        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum < number;
        // Deficient number if sum is less than the number
    }

    // Method to check whether the number is a Strong Number
    public static boolean strongNumber(int number) {

        int temp = number;
        int sum = 0;
        // Variable to store sum of factorials of digits

        // Extract each digit and add its factorial
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
        // Strong number if sum equals original number
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {

        int fact = 1;
        // Variable to store factorial value

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
        // Returning factorial
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number

        // Finding factors of the number
        int[] factors = findFactors(number);

        // Printing all factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Displaying calculated values and number properties
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        System.out.println("Is Perfect Number: " + perfectNumber(number, factors));
        System.out.println("Is Abundant Number: " + abundantNumber(number, factors));
        System.out.println("Is Deficient Number: " + deficientNumber(number, factors));
        System.out.println("Is Strong Number: " + strongNumber(number));
    }
}
