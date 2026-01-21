package coreprogramming.javamethods.level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SumOfNaturalNumbers {

    // Method to calculate the sum of first N natural numbers
    public static int naturalSum(int N) {

        int sum = 0;
        // Variable to store the sum

        // Loop to add all natural numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }

        return sum;
        // Returning the calculated sum
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int N = input.nextInt();
        // Reading the number N

        int sumNumber = naturalSum(N);
        // Calling method to calculate sum of natural numbers

        System.out.println("The sum of " + N + " natural numbers is: " + sumNumber);
        // Printing the result
    }
}
