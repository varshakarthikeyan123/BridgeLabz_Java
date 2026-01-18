/*
 This program calculates the area of a triangle using
 user-provided base and height values.
 It also converts the given height from centimeters
 to inches and feet.
 The program demonstrates user input, arithmetic
 operations, and unit conversion in Java.
*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class AreaOfTriangle {

    public static void main(String[] args) { // main method where execution begins

        Scanner input = new Scanner(System.in); // creates Scanner object for user input

        System.out.print("Enter base of the triangle in cm: "); // prompts user for base
        double base = input.nextDouble(); // reads base value

        System.out.print("Enter height of the triangle in cm: "); // prompts user for height
        double height = input.nextDouble(); // reads height value

        double area = (base * height) / 2; // calculates area of the triangle
        System.out.println("The area of the triangle is " + area + " cm^2."); // displays area

        double heightInch = height / 2.54; // converts height from cm to inches
        double heightFoot = height / 30.48; // converts height from cm to feet

        System.out.println(
                "Your height in cm is " + height + " cm " +
                        "while in feet is " + heightFoot + " ft " +
                        "and in inches is " + heightInch + "″"
        ); // displays height in different units
    }
}
