package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading an integer value from the user

        // Checking if the number is positive
        if (number > 0) {

            // Checking if the number is divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Checking if the number is divisible only by 5
            else if (number % 5 == 0) {
                System.out.println("Buzz");
            }
            // Checking if the number is divisible only by 3
            else if (number % 3 == 0) {
                System.out.println("FizzBuzz");
                // As per current logic, this also prints "FizzBuzz"
            }
            // If the number is positive but not divisible by 3 or 5
            else {
                System.out.println(number + " is positive.");
            }
        }
        // Checking if the number is negative
        else if (number < 0) {
            System.out.println(number + " is negative.");
        }
        // This case occurs when the number is zero
        else {
            System.out.println(number + " is zero.");
        }
    }
}
