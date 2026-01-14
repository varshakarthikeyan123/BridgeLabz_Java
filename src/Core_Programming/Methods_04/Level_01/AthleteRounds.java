package Core_Programming.Methods_04.Level_01;

import java.util.Scanner;

public class AthleteRounds {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Rounds needed: " + calculateRounds(a, b, c));
    }
}

