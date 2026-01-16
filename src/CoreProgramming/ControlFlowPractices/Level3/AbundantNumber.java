package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int N = input.nextInt();
        // Reading the number from the user

        int original = N;
        // Storing the original number for comparison later

        // Loop to ensure the number entered is positive
        while (N < 0) {
            System.out.print("Enter a positive integer: ");
            N = input.nextInt();
            // Asking again until a valid positive number is entered
        }

        int sum = 0;
        // Variable to store the sum of proper divisors

        // Loop to find all proper divisors of the number
        // Proper divisors are numbers less than N that divide N exactly
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
                // Adding divisor to the sum
            }
        }

        System.out.println("Sum of divisors: " + sum);

        // Checking if the number is an abundant number
        // A number is abundant if sum of its proper divisors is greater than the number
        if (sum > original) {
            System.out.println("The given number is an abundant number");
        }
        else {
            System.out.println("The given number is not an abundant number");
        }
    }
}
