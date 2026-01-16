package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;
// Scanner is used to take input from the user

public class QuadraticFormula {

    // Method to calculate roots of a quadratic equation ax^2 + bx + c = 0
    public static double[] quadraticFormula(double a, double b, double c) {

        // Calculate the discriminant (delta = b^2 - 4ac)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, equation has two distinct real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a); // First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a); // Second root
            return new double[]{root1, root2}; // Return both roots
        }
        // If delta is zero, equation has one real root
        else if (delta == 0) {
            double root = -b / (2 * a); // Single root
            return new double[]{root}; // Return single root
        }

        // If delta is negative, no real roots exist
        return new double[0]; // Return empty array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Scanner object to read input values

        System.out.print("Enter value of a: ");
        double a = input.nextDouble(); // Coefficient of x^2

        System.out.print("Enter value of b: ");
        double b = input.nextDouble(); // Coefficient of x

        System.out.print("Enter value of c: ");
        double c = input.nextDouble(); // Constant term

        // Call method to calculate roots
        double[] result = quadraticFormula(a, b, c);

        // Check if roots exist
        if (result.length == 0) {
            System.out.println("No real roots.");
        } else {
            System.out.print("The roots of x are: ");
            // Print all roots returned
            for (double r : result) {
                System.out.print(r + " ");
            }
        }
    }
}
