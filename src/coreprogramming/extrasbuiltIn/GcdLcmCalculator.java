/*
 This program calculates the GCD (Greatest Common Divisor)
 and LCM (Least Common Multiple) of two numbers entered by the user.
 It demonstrates:
 - Method calls
 - Euclidean Algorithm for GCD
 - Formula-based LCM calculation
 - User input using Scanner
*/
package CoreProgramming.extrasbuiltIn;
// Package declaration for extra built-in programs

import java.util.Scanner;
// Importing Scanner class to take input from the user

public class GcdLcmCalculator {
    // Class to calculate GCD and LCM of two numbers

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        // Reading the first number from the user

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        // Reading the second number from the user

        int gcd = calculateGCD(num1, num2);
        // Calling method to calculate GCD of the two numbers

        int lcm = calculateLCM(num1, num2, gcd);
        // Calling method to calculate LCM using the calculated GCD

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        // Displaying the GCD result

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        // Displaying the LCM result
    }

    // Method to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {

        // Loop runs until the remainder becomes zero
        while (b != 0) {

            int temp = b;
            // Temporarily storing the value of b

            b = a % b;
            // Updating b with the remainder of a divided by b

            a = temp;
            // Assigning previous b value to a
        }

        return a;
        // Returning a as it contains the GCD when b becomes 0
    }

    // Method to calculate LCM using the formula:
    // LCM(a, b) = (a × b) / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {

        return (a * b) / gcd;
        // Returning the calculated LCM value
    }
}
