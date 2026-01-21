/*
 This program calculates the volume of a cylinder.
 It takes radius and height as input from the user
 and applies the volume formula of a cylinder.
*/
package CoreProgramming.practiceproblems.assistedproblems;

import java.util.Scanner; // Scanner class is used to take input from the user

public class VolumeOfCylinder {
    public static void main(String[] args) {

        final double PI = 3.14;
        // Constant value of PI

        Scanner input = new Scanner(System.in);
        // Creating Scanner object for user input

        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        // Reading radius value

        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        // Reading height value

        double volume = PI * Math.pow(radius, 2) * height;
        // Formula to calculate volume of cylinder: πr²h

        System.out.println("The volume of the cylinder is: " + volume + " cm^3.");
        // Displaying the calculated volume
    }
}
