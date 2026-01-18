/*
 This program performs different arithmetic operations
 using three integer values entered by the user.
 It demonstrates operator precedence in expressions
 involving addition, multiplication, division,
 and modulus with integer data types.
 The program helps understand how Java evaluates
 arithmetic expressions step by step.
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class IntOperation {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter first number: "); // prompts user for first integer
        int a = input.nextInt(); // reads first integer

        System.out.print("Enter second number: "); // prompts user for second integer
        int b = input.nextInt(); // reads second integer

        System.out.print("Enter third number: "); // prompts user for third integer
        int c = input.nextInt(); // reads third integer

        int operation1 = a + b * c; // multiplication happens before addition
        int operation2 = a * b + c; // multiplication happens before addition
        int operation3 = c + a / b; // division happens before addition
        int operation4 = a % b + c; // modulus happens before addition

        System.out.println(
                "The results of the Int Operations are "
                        + operation1 + " , " + operation2 + " , "
                        + operation3 + " and " + operation4 + "."
        ); // displays all operation results
    }
}
