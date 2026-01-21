/*
 This program takes two integer inputs from the user
 and calculates their sum, then displays the result.
*/
package CoreProgramming.practiceproblems.assistedproblems;

import java.util.Scanner; // Importing Scanner class for user input

public class AddNumbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter first number: "); // Prompting user for first number
        int firstNumber = input.nextInt(); // Reading first number

        System.out.print("Enter second number: "); // Prompting user for second number
        int secondNumber = input.nextInt(); // Reading second number

        int sum = firstNumber + secondNumber; // Calculating sum of two numbers

        System.out.println("The sum is: " + sum); // Printing the sum
    }
}
