package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class QuotientRemainder {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        // Calculating the quotient

        int remainder = number % divisor;
        // Calculating the remainder

        return new int[]{quotient, remainder};
        // Returning quotient and remainder as an array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Reading the number

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();
        // Reading the divisor

        int[] outPut = findRemainderAndQuotient(number, divisor);
        // Calling method to get quotient and remainder

        System.out.println(
                "The quotient and remainder are: "
                        + outPut[0] + " and " + outPut[1]
        );
        // Printing the results
    }
}
