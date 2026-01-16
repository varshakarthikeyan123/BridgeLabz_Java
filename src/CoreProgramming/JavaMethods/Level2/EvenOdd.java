package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class EvenOdd {

    // Method to check whether a number is positive (including zero)
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        int[] numbers = new int[5];
        // Array to store 5 integers

        // Taking input for the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Checking each number for positivity and even/odd
        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];
            // Current number from the array

            if (isPositive(num)) {
                // If number is positive or zero
                if (isEven(num)) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else {
                // If number is negative
                System.out.println(num + " is Negative");
            }
        }

        // Comparing first and last elements of the array
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        // Printing comparison result
        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First and last elements are equal");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}
