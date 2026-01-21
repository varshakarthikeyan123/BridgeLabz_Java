/*
 This package CoreProgramming.JavaMethods.Level3 contains programs
 that perform multiple number property checks using separate methods.
 This program checks whether a number is Prime, Neon, Spy,
 Automorphic, and Buzz number.
*/
package coreprogramming.javamethods.level3;

import java.util.Scanner;
// Scanner is used to take input from the user

public class NumberCheck4 {

    // Method to check whether a number is prime
    public static boolean primeNumber(int number) {

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Loop from 2 to square root of number to check divisibility
        for (int i = 2; i <= Math.sqrt(number); i++) {

            // If divisible by any number, it is not prime
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        // Return true if no divisors are found
    }

    // Method to check whether a number is a Neon number
    public static boolean neonNumber(int number) {

        int square = number * number;
        // Squaring the number

        int sum = 0;
        // Variable to store sum of digits of square

        // Loop to calculate sum of digits of square
        while (square > 0) {
            sum += square % 10;
            // Adding last digit to sum
            square /= 10;
            // Removing last digit
        }
        return sum == number;
        // Neon number if sum equals original number
    }

    // Method to check whether a number is a Spy number
    public static boolean spyNumber(int number) {

        int sum = 0;
        // Variable to store sum of digits

        int product = 1;
        // Variable to store product of digits

        // Loop to extract digits
        while (number > 0) {
            int digit = number % 10;
            // Extracting last digit
            sum += digit;
            // Adding digit to sum
            product *= digit;
            // Multiplying digit to product
            number /= 10;
            // Removing last digit
        }
        return sum == product;
        // Spy number if sum equals product
    }

    // Method to check whether a number is an Automorphic number
    public static boolean automorphicNumber(int number) {

        int square = number * number;
        // Squaring the number

        int temp = number;
        // Temporary variable to compare digits

        // Loop to compare last digits of number and its square
        while (temp > 0) {

            // If last digits do not match, not automorphic
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            // Removing last digit from number
            square /= 10;
            // Removing last digit from square
        }
        return true;
        // Return true if all digits match
    }

    // Method to check whether a number is a Buzz number
    public static boolean buzzNumber(int number) {

        // Buzz number if divisible by 7 or ends with 7
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number

        System.out.println("Is Prime Number: " + primeNumber(number));
        // Printing prime number result

        System.out.println("Is Neon Number: " + neonNumber(number));
        // Printing neon number result

        System.out.println("Is Spy Number: " + spyNumber(number));
        // Printing spy number result

        System.out.println("Is Automorphic Number: " + automorphicNumber(number));
        // Printing automorphic number result

        System.out.println("Is Buzz Number: " + buzzNumber(number));
        // Printing buzz number result
    }
}
