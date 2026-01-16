package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Reading the number from the user

        // Checking whether the entered number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
            return;
            // Exits the program if the number is not natural
        }

        int sum = 0;
        // Variable to store the sum of natural numbers

        // Loop to calculate the sum of first 'number' natural numbers
        for (int i = 1; i <= number; i++) {
            sum = number * (number + 1) / 2;
            // Formula to calculate sum of natural numbers
            // This calculation is repeated, but value remains the same
        }

        System.out.println("The sum of " + number + " natural numbers is " + sum + ".");

        // Checking if the number is equal to the calculated sum
        if (number == sum) {
            System.out.println("The number is equal to the sum of " + number
                    + " numbers");
        }
        else {
            System.out.println("The number is not equal to the sum of " + number
                    + " numbers");
        }
    }
}
