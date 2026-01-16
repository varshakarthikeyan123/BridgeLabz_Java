package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {

        double rad = Math.toRadians(angle);
        // Converting angle from degrees to radians

        double sine = Math.sin(rad);
        // Calculating sine of the angle

        double cosine = Math.cos(rad);
        // Calculating cosine of the angle

        double tangent = Math.tan(rad);
        // Calculating tangent of the angle

        return new double[]{sine, cosine, tangent};
        // Returning sine, cosine, and tangent as an array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();
        // Reading angle in degrees

        double[] result = calculateTrigonometricFunctions(angle);
        // Calling method to calculate trigonometric values

        System.out.println("The sine angle: " + result[0]);
        // Printing sine value

        System.out.println("The cosine angle: " + result[1]);
        // Printing cosine value

        System.out.println("The tangent angle: " + result[2]);
        // Printing tangent value
    }
}
