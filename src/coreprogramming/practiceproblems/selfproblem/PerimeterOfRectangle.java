/*
 This program calculates the perimeter of a rectangle.
 It takes the length and width as input from the user
 and applies the formula: Perimeter = 2 × (length + width).
*/
package CoreProgramming.practiceproblems.selfproblem;

import java.util.Scanner; // Importing Scanner class to take input from the user

public class PerimeterOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creating Scanner object for user input

        System.out.print("Enter length of the rectangle in cm: "); // Prompting user to enter length
        double length = input.nextDouble(); // Reading length of the rectangle

        System.out.print("Enter width of the rectangle in cm: "); // Prompting user to enter width
        double width = input.nextDouble(); // Reading width of the rectangle

        double perimeter = 2 * (length + width); // Calculating perimeter using formula

        System.out.println("Perimeter of the rectangle is: " + perimeter + " cm."); // Displaying the result
    }
}
