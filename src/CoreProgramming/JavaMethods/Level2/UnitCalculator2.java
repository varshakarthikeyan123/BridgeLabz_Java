package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;

public class UnitCalculator2 {

    // Converts distance from yards to feet
    public static double convertYardsToFeet(double yards) {
        double feetConversion = yards * 3; // 1 yard = 3 feet
        return feetConversion;
    }

    // Converts distance from feet to yards
    public static double convertFeetToYards(double feet) {
        double yardsConversion = feet * 0.333333; // 1 foot ≈ 0.333333 yards
        return yardsConversion;
    }

    // Converts distance from meters to inches
    public static double convertMeterToInches(double meter) {
        double inchConversion = meter * 39.3701; // 1 meter = 39.3701 inches
        return inchConversion;
    }

    // Converts distance from inches to meters
    public static double convertInchesToMeter(double inch) {
        double meterConversion = inch * 0.0254; // 1 inch = 0.0254 meters
        return meterConversion;
    }

    // Converts distance from inches to centimeters
    public static double convertInchesToCm(double inch) {
        double cmConversion = inch * 2.54; // 1 inch = 2.54 centimeters
        return cmConversion;
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read distance values in different units
        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter distance in meters: ");
        double meter = input.nextDouble();

        System.out.print("Enter distance in inch: ");
        double inch = input.nextDouble();

        // Perform unit conversions using respective methods
        double result1 = convertYardsToFeet(yards);
        double result2 = convertFeetToYards(feet);
        double result3 = convertMeterToInches(meter);
        double result4 = convertInchesToMeter(inch);
        double result5 = convertInchesToCm(inch);

        // Display all conversion results
        System.out.println(
                "The distance unit conversion results are: "
                        + result1 + " , "
                        + result2 + " ,  "
                        + result3 + " , "
                        + result4 + " and "
                        + result5 + "."
        );
    }
}
