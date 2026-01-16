package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Factors {

    // Method to find and print all factors of a number
    public static void findingFactors(int N) {

        // Loop to ensure the number is positive
        while (N < 0) {
            System.out.print("Enter a positive integer: ");
            N = new Scanner(System.in).nextInt();
            // Taking new input if the number is negative
        }

        // Loop to check each number from 1 to N
        for (int i = 1; i <= N; i++) {

            // If i divides N completely, then i is a factor
            if (N % i == 0) {
                System.out.println(i);
                // Printing the factor
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int N = input.nextInt();
        // Reading the number from the user

        findingFactors(N);
        // Calling the method to find and print factors
    }
}
