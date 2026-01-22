/*
 This program demonstrates constructor chaining.
 The default constructor calls the parameterized constructor
 to initialize the radius of the circle.
*/
package CoreProgramming.JavaConstructors.Level1;

public class CircleArea {

    // Variable to store radius
    double radius;

    // Default constructor
    CircleArea() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized constructor
    CircleArea(double radius) {
        this.radius = radius; // Assign radius
    }

    // Method to calculate area of circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
