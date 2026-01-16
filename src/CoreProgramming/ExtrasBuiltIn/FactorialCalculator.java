package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FactorialCalculator {

    public static void main(String[] args) {

        int number = getInput();
        // Calling method to get a valid number from the user

        long factorial = calculateFactorial(number);
        // Calling recursive method to calculate factorial

        displayResult(number, factorial);
        // Displaying the final result
    }

    // Method to get input from the user
    public static int getInput() {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a non-negative integer to calculate factorial: ");
        int num = scanner.nextInt();
        // Reading the number

        // Factorial is not defined for negative numbers
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers. Exiting.");
            System.exit(0);
            // Terminating the program if input is invalid
        }

        return num;
        // Returning valid input
    }

    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {

        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            // Recursive case:
            // n! = n * (n-1)!
            return n * calculateFactorial(n - 1);
        }
    }

    // Method to display the factorial result
    public static void displayResult(int num, long factorial) {

        System.out.println("Factorial of " + num + " is: " + factorial);
        // Printing the final factorial value
    }
}
