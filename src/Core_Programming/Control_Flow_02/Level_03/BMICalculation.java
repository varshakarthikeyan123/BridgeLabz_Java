package Core_Programming.Control_Flow_02.Level_03;

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();   // in kg
        double heightCm = input.nextDouble(); // in cm

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Status: Underweight");
        else if (bmi >= 18.5 && bmi <= 24.9)
            System.out.println("Status: Normal");
        else if (bmi >= 25 && bmi <= 39.9)
            System.out.println("Status: Overweight");
        else
            System.out.println("Status: Obese");
    }
}
