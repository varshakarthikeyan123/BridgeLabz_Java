package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;

public class UnitCalculator1 {

    // Converts kilometers to miles using standard conversion factor
    public static double convertKmToMiles(double km) {
        double milesConversion = km * 0.621371; // 1 km = 0.621371 miles
        return milesConversion;
    }

    // Converts miles to kilometers using standard conversion factor
    public static double convertMilesTokm(double miles) {
        double kmConversion = miles * 1.60934; // 1 mile = 1.60934 km
        return kmConversion;
    }

    // Converts meters to feet using standard conversion factor
    public static double convertMeterToFeet(double meter) {
        double feetConversion = meter * 3.28084; // 1 meter = 3.28084 feet
        return feetConversion;
    }

    // Converts feet to meters using standard conversion factor
    public static double convertFeetToMeter(double feet) {
        double meterConversion = feet * 0.3048; // 1 foot = 0.3048 meters
        return meterConversion;
    }

    public static void main(String[] args) {

        // Scanner object to read input values from the user
        Scanner input = new Scanner(System.in);

        // Read distance in kilometers
        System.out.print("Enter km: ");
        double km = input.nextDouble();

        // Read distance in miles
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        // Read length in meters
        System.out.print("Enter meter: ");
        double meter = input.nextDouble();

        // Read length in feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        // Perform unit conversions using respective methods
        double result1 = convertKmToMiles(km);
        double result2 = convertMilesTokm(miles);
        double result3 = convertMeterToFeet(meter);
        double result4 = convertFeetToMeter(feet);

        // Display conversion results
        System.out.println("The km to miles conversion: " + result1);
        System.out.println("The miles to km conversion: " + result2);
        System.out.println("The meter to feet conversion: " + result3);
        System.out.println("The feet to meter conversion: " + result4);
    }
}
