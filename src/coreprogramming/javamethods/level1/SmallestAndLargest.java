/*
 This program finds the smallest and largest numbers among three integers.
 It uses a separate method to compare the values and returns the result
 as an array containing the smallest and largest numbers.
*/
package CoreProgramming.javamethods.level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SmallestAndLargest {

    // Method to find the smallest and largest among three numbers
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {

        int smallest = num1;
        // Assuming the first number is the smallest initially

        int largest = num1;
        // Assuming the first number is the largest initially

        if (num2 < smallest) {
            smallest = num2;
            // Updating smallest if second number is smaller
        }

        if (num3 < smallest) {
            smallest = num3;
            // Updating smallest if third number is smaller
        }

        if (num2 > largest) {
            largest = num2;
            // Updating largest if second number is larger
        }

        if (num3 > largest) {
            largest = num3;
            // Updating largest if third number is larger
        }

        return new int[]{smallest, largest};
        // Returning smallest and largest values as an array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        // Reading the first number

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        // Reading the second number

        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();
        // Reading the third number

        int[] result = findSmallestAndLargest(num1, num2, num3);
        // Calling method to find smallest and largest numbers

        System.out.println(
                "The largest number and smallest number are: "
                        + result[1] + " and " + result[0]
        );
        // Displaying the largest and smallest numbers
    }
}
