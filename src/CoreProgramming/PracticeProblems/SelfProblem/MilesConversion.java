package CoreProgramming.PracticeProblems.SelfProblem;

import java.util.Scanner;
public class MilesConversion {
    public static void main(String[] args) {
        final double multiplier = 0.621371;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value in kilometers: ");
        double Km = input.nextDouble();
        double Miles = Km * multiplier;
        System.out.println("The distance in miles is: " + Miles + " mi.");
    }
}
