/*
 This program performs two geometric calculations using coordinates:
 1) Calculates the Euclidean distance between two points.
 2) Finds the equation of the straight line passing through those two points.
 The line equation is displayed in slope–intercept form (y = mx + b),
 and vertical line cases are handled separately.
*/
package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner; // Scanner class is used to take input from the user

public class DistanceAndLine {

    // Method to calculate Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateDistance(double x1, double y1, double x2, double y2) {

        // Applying the distance formula √[(x2−x1)² + (y2−y1)²]
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Returning the calculated distance
        return distance;
    }

    // Method to calculate slope (m) and y-intercept (b) of the line joining two points
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {

        double m; // Variable to store slope
        double b; // Variable to store y-intercept

        // Checking for vertical line to avoid division by zero
        if (x2 - x1 != 0) {

            // Calculating slope using formula (y2 - y1) / (x2 - x1)
            m = (y2 - y1) / (x2 - x1);

            // Calculating y-intercept using equation y = mx + b
            b = y1 - m * x1;
        } else {

            // Assigning infinite slope for vertical line
            m = Double.POSITIVE_INFINITY;

            // Y-intercept is undefined for vertical lines
            b = Double.NaN;
        }

        // Returning slope and intercept as an array
        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        // Reading x-coordinate of first point

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        // Reading y-coordinate of first point

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        // Reading x-coordinate of second point

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        // Reading y-coordinate of second point

        double distance = calculateDistance(x1, y1, x2, y2);
        // Calling method to calculate distance

        // Printing the Euclidean distance with formatted output
        System.out.printf(
                "Euclidean distance between (%.2f, %.2f) and (%.2f, %.2f) = %.2f\n",
                x1, y1, x2, y2, distance
        );

        double[] line = getLineEquation(x1, y1, x2, y2);
        // Calling method to get slope and intercept

        double m = line[0];
        // Extracting slope value

        double b = line[1];
        // Extracting intercept value

        // Checking if the line is vertical
        if (Double.isInfinite(m)) {

            // Printing equation for a vertical line
            System.out.printf("The line is vertical: x = %.2f\n", x1);
        } else {

            // Printing line equation in slope-intercept form
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", m, b);
        }
    }
}
