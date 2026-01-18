/*
 This program reads 5 integers from the user and checks:
 1) Whether each number is positive or negative
 2) Whether each positive number is even or odd
 3) Compares the first and last elements of the array
*/
package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class EvenOdd {

    // Method to check whether a number is positive (including zero)
    public static boolean isPositive(int number) {
        return number >= 0;
        // Returns true if number is zero or positive
    }

    // Method to check whether a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
        // Returns true if number is divisible by 2
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
            // num1 is greater than num2
        } else if (num1 == num2) {
            return 0;
            // num1 is equal to num2
        } else {
            return -1;
            // num1 is less than num2
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        int[] numbers = new int[5];
        // Array to store 5 integer values

        // Loop to take input for the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            // Prompting user for input
            numbers[i] = input.nextInt();
            // Storing input value in array
        }

        // Loop to check each number
        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];
            // Fetching current number from array

            if (isPositive(num)) {
                // Checking if number is positive or zero
                if (isEven(num)) {
                    System.out.println(num + " is Positive and Even");
                    // Printing result for positive even number
                } else {
                    System.out.println(num + " is Positive and Odd");
                    // Printing result for positive odd number
                }
            } else {
                System.out.println(num + " is Negative");
                // Printing result for negative number
            }
        }

        // Comparing first and last elements of the array
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        // Storing comparison result

        // Printing comparison output
        if (result == 1) {
            System.out.println("First element is greater than last element");
            // First element is larger
        } else if (result == 0) {
            System.out.println("First and last elements are equal");
            // Both elements are equal
        } else {
            System.out.println("First element is less than last element");
            // First element is smaller
        }
    }
}
