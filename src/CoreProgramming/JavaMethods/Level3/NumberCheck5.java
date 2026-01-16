package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;

public class NumberCheck5  {

    // Method to find all factors of a given number
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count how many factors the number has
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to actually store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor from the factors array
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }

    // Method to calculate the sum of all factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to calculate the product of all factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to calculate the product of cubes of all factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3); // cube each factor and multiply
        }
        return product;
    }

    // Method to check if the number is a Perfect Number
    public static boolean perfectNumber(int number, int[] factors) {
        int sum = 0;
        // Sum of proper divisors (excluding the number itself)
        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum == number;
    }

    // Method to check if the number is an Abundant Number
    public static boolean abundantNumber(int number, int[] factors) {
        int sum = 0;
        // Sum of proper divisors
        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum > number;
    }

    // Method to check if the number is a Deficient Number
    public static boolean deficientNumber(int number, int[] factors) {
        int sum = 0;
        // Sum of proper divisors
        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum < number;
    }

    // Method to check if the number is a Strong Number
    public static boolean strongNumber(int number) {
        int temp = number;
        int sum = 0;

        // Extract each digit and add factorial of the digit
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        // Print all factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Display various calculations and checks
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
