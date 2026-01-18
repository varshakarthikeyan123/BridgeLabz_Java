/*
 This program calculates the average of three numbers
 entered by the user.
*/
package CoreProgramming.PracticeProblems.SelfProblem;

import java.util.Scanner; // Importing Scanner class for user input

public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter first number: "); // Asking user for first number
        double num1 = input.nextDouble(); // Reading first number

        System.out.print("Enter second number: "); // Asking user for second number
        double num2 = input.nextDouble(); // Reading second number

        System.out.print("Enter third number: "); // Asking user for third number
        double num3 = input.nextDouble(); // Reading third number

        double average = (num1 + num2 + num3) / 3; // Calculating average of three numbers

        System.out.println("The average is: " + average); // Printing the average
    }
}
