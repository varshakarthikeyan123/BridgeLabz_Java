package CoreProgramming.PracticeProblems.AssistedProblems;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle in cm: ");
        double radius = input.nextDouble();
        double area = PI * Math.pow(radius, 2);
        System.out.println("Area of circle is: " + area + " cm^2.");
    }
}
