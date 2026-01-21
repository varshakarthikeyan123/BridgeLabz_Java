/*
 This program implements a simple calculator using Java.
 It takes two numbers and an arithmetic operator from the user
 and performs the corresponding operation using a switch case.
*/
package coreprogramming.extrasbuiltIn;
// Defines the package for extra built-in practice programs

import java.util.Scanner;
// Imports Scanner class to take input from the user

public class Calculator {
    // Main Calculator class

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter first number: ");
        float firstNumber = input.nextFloat();
        // Reading the first number from the user

        System.out.print("Enter second number: ");
        float secondNumber = input.nextFloat();
        // Reading the second number from the user

        System.out.print("Enter operation: ");
        String op = input.next();
        // Reading the arithmetic operator (+, -, *, /)

        // switch statement to perform operation based on user input
        switch (op) {

            case "+":
                float add = firstNumber + secondNumber;
                // Performing addition
                System.out.println(add);
                // Printing addition result
                break;

            case "-":
                float sub = firstNumber - secondNumber;
                // Performing subtraction
                System.out.println(sub);
                // Printing subtraction result
                break;

            case "*":
                float multiplication = firstNumber * secondNumber;
                // Performing multiplication
                System.out.println(multiplication);
                // Printing multiplication result
                break;

            case "/":
                float div = firstNumber / secondNumber;
                // Performing division
                System.out.println(div);
                // Printing division result
                break;

            default:
                System.out.println("Invalid operation");
                // Executed if an unsupported operator is entered
        }
    }
}
