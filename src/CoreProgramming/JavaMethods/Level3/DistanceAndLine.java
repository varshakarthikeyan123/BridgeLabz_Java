package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;

public class DistanceAndLine {

    // Method to calculate Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateDistance(double x1, double y1, double x2, double y2) {

        // Apply distance formula: √[(x2−x1)² + (y2−y1)²]
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate slope (m) and intercept (b) of the line joining two points
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {

        double m; // slope
        double b; // y-intercept

        // Check to avoid division by zero for vertical lines
        if (x2 - x1 != 0) {
            // Calculate slope
            m = (y2 - y1) / (x2 - x1);

            // Calculate y-intercept using equation y = mx + b
            b = y1 - m * x1;
        } else {
            // Vertical line case: slope is infinite and intercept is undefined
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN;
        }

        // Return slope and intercept as an array
        return new double[]{m, b};
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read coordinates of the first point
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Read coordinates of the second point
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate distance between the two points
        double distance = calculateDistance(x1, y1, x2, y2);

        // Display the calculated distance
        System.out.printf(
                "Euclidean distance between (%.2f, %.2f) and (%.2f, %.2f) = %.2f\n",
                x1, y1, x2, y2, distance
        );

        // Get slope and intercept of the line
        double[] line = getLineEquation(x1, y1, x2, y2);
        double m = line[0];
        double b = line[1];

        // Check if the line is vertical
        if (Double.isInfinite(m)) {
            // Vertical line equation
            System.out.printf("The line is vertical: x = %.2f\n", x1);
        } else {
            // Line equation in slope-intercept form
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", m, b);
        }
    }
}
