/*
 This program finds the quotient and remainder
 when a number is divided by a divisor.
*/
package CoreProgramming.javamethods.level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class QuotientRemainder {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        int[] output = findRemainderAndQuotient(number, divisor);
        // Calling the method

        System.out.println(
                "The quotient and remainder are: "
                        + output[0] + " and " + output[1]
        );
    }
}
