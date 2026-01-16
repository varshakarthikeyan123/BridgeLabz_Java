package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number to be checked

        boolean isPrime = true;
        // Assuming the number is prime initially

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        }
        else {
            // Checking divisibility from 2 to number - 1
            for (int i = 2; i < number; i++) {

                // If number is divisible by any value, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break;
                    // Exit loop once a factor is found
                }
            }
        }

        // Printing result based on the isPrime flag
        if (isPrime) {
            System.out.println(number + " is a Prime number");
        }
        else {
            System.out.println(number + " is not a Prime number");
        }
    }
}
