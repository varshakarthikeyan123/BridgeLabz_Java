/*
 This program performs various distance unit conversions.
 It converts:
 1) Yards to Feet
 2) Feet to Yards
 3) Meters to Inches
 4) Inches to Meters
 5) Inches to Centimeters
 The program takes user input for each unit and displays the converted values.
*/
package CoreProgramming.javamethods.level2;
// Package declaration for organizing JavaMethods Level2 programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class UnitCalculator2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double feetConversion = yards * 3;
        // 1 yard equals 3 feet
        return feetConversion;
        // Returning converted value
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double yardsConversion = feet * 0.333333;
        // 1 foot is approximately equal to 0.333333 yards
        return yardsConversion;
        // Returning converted value
    }

    // Method to convert meters to inches
    public static double convertMeterToInches(double meter) {
        double inchConversion = meter * 39.3701;
        // 1 meter equals 39.3701 inches
        return inchConversion;
        // Returning converted value
    }

    // Method to convert inches to meters
    public static double convertInchesToMeter(double inch) {
        double meterConversion = inch * 0.0254;
        // 1 inch equals 0.0254 meters
        return meterConversion;
        // Returning converted value
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inch) {
        double cmConversion = inch * 2.54;
        // 1 inch equals 2.54 centimeters
        return cmConversion;
        // Returning converted value
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();
        // Reading distance in yards

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        // Reading distance in feet

        System.out.print("Enter distance in meters: ");
        double meter = input.nextDouble();
        // Reading distance in meters

        System.out.print("Enter distance in inch: ");
        double inch = input.nextDouble();
        // Reading distance in inches

        double result1 = convertYardsToFeet(yards);
        // Converting yards to feet

        double result2 = convertFeetToYards(feet);
        // Converting feet to yards

        double result3 = convertMeterToInches(meter);
        // Converting meters to inches

        double result4 = convertInchesToMeter(inch);
        // Converting inches to meters

        double result5 = convertInchesToCm(inch);
        // Converting inches to centimeters

        System.out.println(
                "The distance unit conversion results are: "
                        + result1 + " , "
                        + result2 + " , "
                        + result3 + " , "
                        + result4 + " and "
                        + result5 + "."
        );
        // Displaying all conversion results

        input.close();
        // Closing the Scanner
    }
}
