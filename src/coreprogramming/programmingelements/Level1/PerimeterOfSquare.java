/*
 This program calculates the length of a side of a square
 using the given perimeter.
 It takes the perimeter as input from the user,
 applies the formula side = perimeter / 4,
 and displays the result.
 The program demonstrates user input, arithmetic
 calculation, and output in Java.
*/

package CoreProgramming.programmingelements.Level1;

import java.util.Scanner; // imports Scanner class to read input from the user

public class PerimeterOfSquare {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for taking input

        System.out.print("Enter the perimeter of square in cm: "); // prompts user to enter perimeter
        double perimeter = input.nextDouble(); // reads the perimeter value

        double side = perimeter / 4; // calculates the length of one side of the square

        System.out.println(
                "The length of the side is " + side + " cm "
                        + "whose perimeter is " + perimeter + " cm."
        ); // displays the calculated side length
    }
}
