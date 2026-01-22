/*
 This program demonstrates the use of classes and objects in Java.
 It defines a Circle class with encapsulated data and methods to
 access and modify the radius. The CircleArea class calculates
 and displays the area of a circle using user input.
*/
package CoreProgramming.ClassAndObjects.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take input from the user

class Circle { // Defines the Circle class

    private double radius; // Stores the radius of the circle

    public Circle(double radius) { // Constructor to initialize radius
        this.radius = radius; // Assigns the radius value to the instance variable
    }

    public double getRadius() { // Getter method to access radius
        return this.radius; // Returns the radius value
    }

    public void setRadius(double radius) { // Setter method to update radius
        if (radius > 0) { // Checks if radius is a positive value
            this.radius = radius; // Updates the radius
        }
    }
}

public class CircleArea { // Defines the main class

    public static double area(Circle circle) { // Method to calculate area of a circle
        double area = Math.PI * circle.getRadius() * circle.getRadius(); // Calculates area using formula πr²
        return area; // Returns the calculated area
    }

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter radius: "); // Prompts user to enter radius
        double radius = input.nextDouble(); // Reads the radius value

        Circle circle = new Circle(radius); // Creates a Circle object with given radius
        System.out.println("Area of circle: " + area(circle)); // Displays the calculated area
    }
}
