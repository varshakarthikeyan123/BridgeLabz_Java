package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FizzBuzzFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number up to which FizzBuzz should be printed

        int i = 1;
        // Initializing counter variable starting from 1

        // Loop runs from 1 to the entered number
        while (i <= number) {

            // If number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // If number is divisible only by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // If number is divisible only by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If number is not divisible by 3 or 5
            else {
                System.out.println(i);
            }

            i++;
            // Incrementing counter to move to the next number
        }
    }
}
