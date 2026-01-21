/*
 This program checks whether three given points are collinear.
 Collinearity is verified using two methods:
 1) Slope (cross-multiplication) method
 2) Area of triangle method
 The program takes coordinates of three points as input
 and prints whether they lie on the same straight line.
*/
package coreprogramming.javamethods.level3;

import java.util.Scanner; // Scanner class is used to take input from the user

public class Collinear {

    // Method to check collinearity using slope comparison (cross multiplication)
    public static boolean isCollinearBySlope(double x1, double y1,
                                             double x2, double y2,
                                             double x3, double y3) {

        // Checking slope equality using cross multiplication to avoid division
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle method
    public static boolean isCollinearByArea(double x1, double y1,
                                            double x2, double y2,
                                            double x3, double y3) {

        // Calculating area of triangle formed by three points
        double area = x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2);

        // If area is nearly zero, points are collinear
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter x1 y1: "); // Prompting user for first point
        double x1 = input.nextDouble(); // Reading x-coordinate of first point
        double y1 = input.nextDouble(); // Reading y-coordinate of first point

        System.out.print("Enter x2 y2: "); // Prompting user for second point
        double x2 = input.nextDouble(); // Reading x-coordinate of second point
        double y2 = input.nextDouble(); // Reading y-coordinate of second point

        System.out.print("Enter x3 y3: "); // Prompting user for third point
        double x3 = input.nextDouble(); // Reading x-coordinate of third point
        double y3 = input.nextDouble(); // Reading y-coordinate of third point

        // Checking collinearity using slope method
        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (Slope Method).");
        } else {
            System.out.println("The points are NOT collinear (Slope Method).");
        }

        // Checking collinearity using area method
        if (isCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (Area Method).");
        } else {
            System.out.println("The points are NOT collinear (Area Method).");
        }

        input.close(); // Closing the Scanner to release resources
    }
}
