/*
 This program performs multiple unit conversions.
 It converts:
 1) Temperature from Fahrenheit to Celsius
 2) Temperature from Celsius to Fahrenheit
 3) Weight from Pounds to Kilograms
 4) Weight from Kilograms to Pounds
 5) Volume from Gallons to Liters
 6) Volume from Liters to Gallons
 The program takes user input for each unit and displays the converted results.
*/
package coreprogramming.javamethods.level2;
// Package declaration for Java Methods Level 2 programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class UnitCalculator3 {

    // Method to convert temperature from Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double celsiusConversion = (farhenheit - 32) * 5 / 9;
        // Applying Fahrenheit to Celsius conversion formula
        return celsiusConversion;
        // Returning converted temperature
    }

    // Method to convert temperature from Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double farhenheitConversion = (celsius * 9 / 5) + 32;
        // Applying Celsius to Fahrenheit conversion formula
        return farhenheitConversion;
        // Returning converted temperature
    }

    // Method to convert weight from pounds to kilograms
    public static double convertPondsToKilograms(double pound) {
        double kilogramConversion = pound * 0.453592;
        // 1 pound equals 0.453592 kilograms
        return kilogramConversion;
        // Returning converted weight
    }

    // Method to convert weight from kilograms to pounds
    public static double convertKilogramsToPounds(double km) {
        double poundsConversion = km * 2.20462;
        // 1 kilogram equals 2.20462 pounds
        return poundsConversion;
        // Returning converted weight
    }

    // Method to convert volume from gallons to liters
    public static double convertGallonsToLiters(double gallon) {
        double literConversion = gallon * 3.78541;
        // 1 gallon equals 3.78541 liters
        return literConversion;
        // Returning converted volume
    }

    // Method to convert volume from liters to gallons
    public static double convertLitersToGallon(double liters) {
        double gallonConversion = liters * 0.264172;
        // 1 liter equals 0.264172 gallons
        return gallonConversion;
        // Returning converted volume
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter temperature in farhenheit: ");
        double farhenheit = input.nextDouble();
        // Reading temperature in Fahrenheit

        System.out.print("Enter temperature in celsius: ");
        double celsius = input.nextDouble();
        // Reading temperature in Celsius

        System.out.print("Enter weight in pound: ");
        double pound = input.nextDouble();
        // Reading weight in pounds

        System.out.print("Enter weight in km: ");
        double km = input.nextDouble();
        // Reading weight in kilograms

        System.out.print("Enter quantity in gallon: ");
        double gallon = input.nextDouble();
        // Reading volume in gallons

        System.out.print("Enter quantity in liters: ");
        double liters = input.nextDouble();
        // Reading volume in liters

        double result1 = convertFarhenheitToCelsius(farhenheit);
        // Converting Fahrenheit to Celsius

        double result2 = convertCelsiusToFarhenheit(celsius);
        // Converting Celsius to Fahrenheit

        double result3 = convertPondsToKilograms(pound);
        // Converting pounds to kilograms

        double result4 = convertKilogramsToPounds(km);
        // Converting kilograms to pounds

        double result5 = convertGallonsToLiters(gallon);
        // Converting gallons to liters

        double result6 = convertLitersToGallon(liters);
        // Converting liters to gallons

        System.out.println(
                "The distance unit conversion results are: "
                        + result1 + " , "
                        + result2 + " , "
                        + result3 + " , "
                        + result4 + " , "
                        + result5 + " and "
                        + result6 + "."
        );
        // Displaying all conversion results

        input.close();
        // Closing the Scanner
    }
}
