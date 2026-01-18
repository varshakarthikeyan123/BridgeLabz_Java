/*
 This program implements a simple Calculator using switch-case.
 It takes two numbers and an arithmetic operator from the user
 and performs the corresponding calculation.
*/
package CoreProgramming.ControlFlowPractices.Level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Calculator {
    // Main class definition

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

        System.out.print("Enter operation (+, -, *, /): ");
        String op = input.next();
        // Reading the arithmetic operation symbol

        // switch statement to perform operation based on user input
        switch (op) {

            case "+":
                float add = firstNumber + secondNumber;
                // Performing addition
                System.out.println("Result: " + add);
                break;

            case "-":
                float sub = firstNumber - secondNumber;
                // Performing subtraction
                System.out.println("Result: " + sub);
                break;

            case "*":
                float multiplication = firstNumber * secondNumber;
                // Performing multiplication
                System.out.println("Result: " + multiplication);
                break;

            case "/":
                // Checking for division by zero
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero is not allowed");
                } else {
                    float div = firstNumber / secondNumber;
                    // Performing division
                    System.out.println("Result: " + div);
                }
                break;

            default:
                System.out.println("Invalid operation");
                // Executed when an unsupported operator is entered
        }
    }
}
