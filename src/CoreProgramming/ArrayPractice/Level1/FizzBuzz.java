package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input values

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number up to which FizzBuzz should be generated

        String[] fizzBuzz = new String[number + 1];
        // Creating a String array of size (number + 1)
        // Index 0 is unused so that index matches the number position

        // Loop to generate FizzBuzz values from 1 to number
        for (int i = 1; i <= number; i++) {

            // Checking if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz[i] = "FizzBuzz";
            }
            // Checking if the number is divisible only by 3
            else if (i % 3 == 0) {
                fizzBuzz[i] = "Fizz";
            }
            // Checking if the number is divisible only by 5
            else if (i % 5 == 0) {
                fizzBuzz[i] = "Buzz";
            }
            // If the number is not divisible by 3 or 5
            else {
                fizzBuzz[i] = String.valueOf(i);
                // Converting integer to String before storing in the array
            }
        }

        System.out.print("The result is: ");

        // Loop to display each position with its corresponding value
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzz[i]);
        }

        System.out.print("The result array is: ");

        // Loop to display the final FizzBuzz array values
        for (int i = 1; i <= number; i++) {
            System.out.print(fizzBuzz[i] + " ");
        }
    }
}
