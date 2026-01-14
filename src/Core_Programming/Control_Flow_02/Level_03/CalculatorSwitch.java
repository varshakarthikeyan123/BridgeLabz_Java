package Core_Programming.Control_Flow_02.Level_03;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (first + second));
                break;
            case '-':
                System.out.println("Result = " + (first - second));
                break;
            case '*':
                System.out.println("Result = " + (first * second));
                break;
            case '/':
                System.out.println("Result = " + (first / second));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}