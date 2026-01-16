package CoreProgramming.PracticeProblems.AssistedProblems;

import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        double volume = PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder is: " + volume + " cm^3.");
    }
}
