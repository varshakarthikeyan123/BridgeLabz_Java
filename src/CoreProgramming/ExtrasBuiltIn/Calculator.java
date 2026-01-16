package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter first number: ");
        float firstNumber = input.nextFloat();
        // Reading the first number

        System.out.print("Enter second number: ");
        float secondNumber = input.nextFloat();
        // Reading the second number

        System.out.print("Enter operation: ");
        String op = input.next();
        // Reading the operation symbol (+, -, *, /)

        // switch statement to decide which operation to perform
        switch (op) {

            case "+":
                float add = firstNumber + secondNumber;
                // Performing addition
                System.out.println(add);
                break;

            case "-":
                float sub = firstNumber - secondNumber;
                // Performing subtraction
                System.out.println(sub);
                break;

            case "*":
                float multiplication = firstNumber * secondNumber;
                // Performing multiplication
                System.out.println(multiplication);
                break;

            case "/":
                float div = firstNumber / secondNumber;
                // Performing division
                System.out.println(div);
                break;

            default:
                System.out.println("Invalid operation");
                // Executed when the entered operator is not supported
        }
    }
}
