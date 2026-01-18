/*
 This program performs different arithmetic operations
 using three double values entered by the user.
 It demonstrates operator precedence in expressions
 involving addition, multiplication, division,
 and modulus with double data types.
 The program also shows how different expressions
 produce different results.
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class DoubleOpt {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter first number: "); // prompts user for first number
        double a = input.nextDouble(); // reads first number

        System.out.print("Enter second number: "); // prompts user for second number
        double b = input.nextDouble(); // reads second number

        System.out.print("Enter third number: "); // prompts user for third number
        double c = input.nextDouble(); // reads third number

        double operation1 = a + b * c; // multiplication happens before addition
        double operation2 = a * b + c; // multiplication happens before addition
        double operation3 = c + a / b; // division happens before addition
        double operation4 = a % b + c; // modulus happens before addition

        System.out.println(
                "The results of the Double Operations are "
                        + operation1 + " , " + operation2 + " , "
                        + operation3 + " and " + operation4 + "."
        ); // displays all operation results
    }
}
