package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner;
// Scanner is used to take input from the user

public class FactorArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number whose factors are to be found

        int maxFactor = 10;
        // Initial size of the array to store factors

        int[] factor = new int[maxFactor];
        // Array to store factors of the given number

        int index = 0;
        // Keeps track of the current position in the factor array

        // Loop to find all factors of the number
        for (int i = 1; i <= number; i++) {

            // Checking if 'i' is a factor of the number
            if (number % i == 0) {

                // If the array is full, increase its size
                if (index == maxFactor) {

                    int newSize = maxFactor * 2;
                    // New array size is double the current size

                    int[] temp = new int[newSize];
                    // Temporary array with increased size

                    // Copying old factors into the new array
                    for (int j = 0; j < factor.length; j++) {
                        temp[j] = factor[j];
                    }

                    factor = temp;
                    // Assigning the new array back to factor

                    maxFactor = newSize;
                    // Updating the maximum size value
                }

                factor[index] = i;
                // Storing the factor in the array

                index++;
                // Moving to the next index position
            }
        }

        System.out.print("The array of factors is: ");

        // Loop to display only the stored factors
        for (int i = 0; i < index; i++) {
            System.out.print(factor[i] + " ");
        }
    }
}
