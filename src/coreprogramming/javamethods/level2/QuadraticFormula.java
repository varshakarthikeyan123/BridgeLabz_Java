/*
 This program calculates the real roots of a quadratic equation
 of the form ax² + bx + c = 0 using the quadratic formula.
 It handles cases where there are two real roots, one real root,
 or no real roots based on the discriminant value.
*/
package coreprogramming.javamethods.level2;
// Package declaration for organizing JavaMethods Level 2 programs

import java.util.Scanner;
// Scanner is used to take input from the user

public class QuadraticFormula {
    // Class definition for solving quadratic equations

    // Method to calculate roots of a quadratic equation ax^2 + bx + c = 0
    public static double[] quadraticFormula(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4 * a * c;
        // Calculating the discriminant (b² − 4ac)

        if (delta > 0) {
            // Condition when discriminant is positive (two real roots)

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            // Calculating the first real root

            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            // Calculating the second real root

            return new double[]{root1, root2};
            // Returning both real roots
        }
        else if (delta == 0) {
            // Condition when discriminant is zero (one real root)

            double root = -b / (2 * a);
            // Calculating the single real root

            return new double[]{root};
            // Returning the single root
        }

        return new double[0];
        // Returning empty array when no real roots exist
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter value of a: ");
        // Prompting user to enter coefficient a

        double a = input.nextDouble();
        // Reading coefficient of x²

        System.out.print("Enter value of b: ");
        // Prompting user to enter coefficient b

        double b = input.nextDouble();
        // Reading coefficient of x

        System.out.print("Enter value of c: ");
        // Prompting user to enter constant c

        double c = input.nextDouble();
        // Reading constant term

        double[] result = quadraticFormula(a, b, c);
        // Calling method to calculate quadratic roots

        if (result.length == 0) {
            // Checking if no real roots are returned

            System.out.println("No real roots.");
            // Printing message when roots do not exist
        }
        else {
            // Case when one or two real roots exist

            System.out.print("The roots of x are: ");
            // Printing heading for roots

            for (double r : result) {
                // Looping through all returned roots

                System.out.print(r + " ");
                // Printing each root
            }
        }
    }
}
