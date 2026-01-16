package CoreProgramming.PracticeProblems.SelfProblem;

import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = input.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();
        double powerNumber = Math.pow(base, exponent);
        System.out.println("Task1512.Power of the given number is: " + powerNumber);
    }
}
