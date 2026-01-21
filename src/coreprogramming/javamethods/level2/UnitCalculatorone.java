/*
 This program performs basic unit conversions:
 1) Kilometers to Miles
 2) Miles to Kilometers
 3) Meters to Feet
 4) Feet to Meters
*/
package coreprogramming.javamethods.level2;
// Package declaration

import java.util.Scanner;
// Scanner class is used to take input from the user

public class UnitCalculator1 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        // 1 kilometer = 0.621371 miles
        return km * 0.621371;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        // 1 mile = 1.60934 kilometers
        return miles * 1.60934;
    }

    // Method to convert meters to feet
    public static double convertMeterToFeet(double meter) {
        // 1 meter = 3.28084 feet
        return meter * 3.28084;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeter(double feet) {
        // 1 foot = 0.3048 meters
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter kilometers: ");
        double km = input.nextDouble();
        // Reading kilometers

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        // Reading miles

        System.out.print("Enter meters: ");
        double meter = input.nextDouble();
        // Reading meters

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        // Reading feet

        // Performing unit conversions
        double kmToMiles = convertKmToMiles(km);
        double milesToKm = convertMilesToKm(miles);
        double meterToFeet = convertMeterToFeet(meter);
        double feetToMeter = convertFeetToMeter(feet);

        // Displaying results
        System.out.println("Kilometers to Miles: " + kmToMiles);
        System.out.println("Miles to Kilometers: " + milesToKm);
        System.out.println("Meters to Feet: " + meterToFeet);
        System.out.println("Feet to Meters: " + feetToMeter);

        input.close();
        // Closing Scanner
    }
}
