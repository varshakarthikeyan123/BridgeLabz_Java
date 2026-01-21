/*
 This program checks whether a given number is a Prime number.
 A prime number is a number greater than 1 that has only two factors:
 1 and itself.
*/
package coreprogramming.extrasbuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input from the keyboard

        System.out.print("Enter a number: ");
        // Prompting the user to enter a number

        int number = input.nextInt();
        // Reading the number entered by the user

        boolean isPrime = true;
        // Assuming the number is prime initially

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
            // Marking number as not prime
        }
        else {
            // Loop to check divisibility from 2 to number - 1
            for (int i = 2; i < number; i++) {

                // Checking if the number is divisible by i
                if (number % i == 0) {
                    isPrime = false;
                    // Setting flag to false if a divisor is found

                    break;
                    // Exiting the loop once a factor is found
                }
            }
        }

        // Checking the prime flag and displaying the result
        if (isPrime) {
            System.out.println(number + " is a Prime number");
            // Printing prime message
        }
        else {
            System.out.println(number + " is not a Prime number");
            // Printing not-prime message
        }

        input.close();
        // Closing Scanner to release resources
    }
}
