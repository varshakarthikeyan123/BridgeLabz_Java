package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class GcdLcmCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        // Reading the first number

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        // Reading the second number

        int gcd = calculateGCD(num1, num2);
        // Calling method to calculate GCD of the two numbers

        int lcm = calculateLCM(num1, num2, gcd);
        // Calling method to calculate LCM using GCD

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Method to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {

        // Loop continues until remainder becomes zero
        while (b != 0) {

            int temp = b;
            // Storing value of b temporarily

            b = a % b;
            // Calculating remainder

            a = temp;
            // Updating a with previous b value
        }

        return a;
        // a contains the GCD when b becomes 0
    }

    // Method to calculate LCM using formula:
    // LCM(a, b) = (a × b) / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {

        return (a * b) / gcd;
        // Returning LCM value
    }
}
