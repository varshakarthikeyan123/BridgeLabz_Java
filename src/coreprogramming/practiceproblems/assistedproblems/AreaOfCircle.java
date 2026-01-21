/*
 This program calculates the area of a circle
 by taking the radius as input from the user
 and applying the formula π × r².
*/
package CoreProgramming.practiceproblems.assistedproblems;

import java.util.Scanner; // Importing Scanner class for user input

public class AreaOfCircle {
    public static void main(String[] args) {

        final double PI = 3.14; // Declaring constant value of PI

        Scanner input = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter radius of circle in cm: "); // Prompting user for radius
        double radius = input.nextDouble(); // Reading radius value

        double area = PI * Math.pow(radius, 2); // Calculating area using formula πr²

        System.out.println("Area of circle is: " + area + " cm^2."); // Printing the area
    }
}
