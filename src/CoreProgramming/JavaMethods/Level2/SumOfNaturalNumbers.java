package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to calculate sum of first N natural numbers
    public static int recursionSum(int N) {

        // Base case: if N is 0, sum is 0
        if (N == 0) {
            return 0;
        }

        // Recursive case: add N to the sum of numbers from 1 to (N-1)
        return N + recursionSum(N - 1);
    }

    // Method to calculate sum using the direct mathematical formula
    public static int sumNumber(int N) {

        // Formula for sum of first N natural numbers: N * (N + 1) / 2
        int sum = N * (N + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the value of N from the user
        System.out.print("Enter number: ");
        int N = input.nextInt();

        // Calculate sum using recursion
        int result1 = recursionSum(N);

        // Calculate sum using formula
        int result2 = sumNumber(N);

        // Compare both results and print whether they match
        if (result1 == result2) {
            System.out.println("Both methods provide the same output.");
        } else {
            System.out.println("They provide different output.");
        }
    }
}
