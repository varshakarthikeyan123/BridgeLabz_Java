package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SmallestAndLargest {

    // Method to find the smallest and largest among three numbers
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {

        int smallest = num1;
        // Assume first number is the smallest initially

        int largest = num1;
        // Assume first number is the largest initially

        // Compare second number with current smallest
        if (num2 < smallest) {
            smallest = num2;
        }

        // Compare third number with current smallest
        if (num3 < smallest) {
            smallest = num3;
        }

        // Compare second number with current largest
        if (num2 > largest) {
            largest = num2;
        }

        // Compare third number with current largest
        if (num3 > largest) {
            largest = num3;
        }

        // Return smallest and largest as an array
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        // Reading first number

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        // Reading second number

        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();
        // Reading third number

        int[] result = findSmallestAndLargest(num1, num2, num3);
        // Calling method to find smallest and largest

        System.out.println(
                "The largest number and smallest number are: "
                        + result[1] + " and " + result[0]
        );
        // Printing largest and smallest values
    }
}
