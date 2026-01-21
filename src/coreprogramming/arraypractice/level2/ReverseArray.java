/*
 This program reverses the digits of a given number using an array.
 It calculates the number of digits, stores each digit in reverse order,
 and then displays the reversed array.
*/
package coreprogramming.arraypractice.level2; // Defines the package for Level 2 array practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class ReverseArray { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input from the user

        System.out.println("Enter a number: ");
        // Prompting user to enter a number
        int number = input.nextInt();
        // Reading the number from the user

        int length = (int) Math.log10(number) + 1;
        // Calculating number of digits using log10 formula

        int[] arr = new int[length];
        // Declaring an array to store digits in reverse order

        int index = 0;
        // Index variable to track current position in the array

        // Loop to extract digits and store them in the array
        for (int i = 0; i < length; i++) {

            arr[index] = number % 10;
            // Extracting the last digit of the number and storing it

            number = number / 10;
            // Removing the last digit from the number

            index++;
            // Moving to the next index in the array
        }

        System.out.println("The reverse array is: ");
        // Printing message before displaying reversed array

        // Loop to display the reversed digits stored in the array
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
            // Printing each digit from the array
        }
    }
}
