package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;

public class UnitCalculator3 {

    // Converts temperature from Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        // Formula to convert Fahrenheit to Celsius
        double celsiusConversion = (farhenheit - 32) * 5 / 9;
        return celsiusConversion;
    }

    // Converts temperature from Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        // Formula to convert Celsius to Fahrenheit
        double farhenheitConversion = (celsius * 9 / 5) + 32;
        return farhenheitConversion;
    }

    // Converts weight from pounds to kilograms
    public static double convertPondsToKilograms(double pound) {
        // 1 pound = 0.453592 kilograms
        double kilogramConversion = pound * 0.453592;
        return kilogramConversion;
    }

    // Converts weight from kilograms to pounds
    public static double convertKilogramsToPounds(double km) {
        // 1 kilogram = 2.20462 pounds
        double poundsConversion = km * 2.20462;
        return poundsConversion;
    }

    // Converts volume from gallons to liters
    public static double convertGallonsToLiters(double gallon) {
        // 1 gallon = 3.78541 liters
        double literConversion = gallon * 3.78541;
        return literConversion;
    }

    // Converts volume from liters to gallons
    public static double convertLitersToGallon(double liters) {
        // 1 liter = 0.264172 gallons
        double gallonConversion = liters * 0.264172;
        return gallonConversion;
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in farhenheit: ");
        double farhenheit = input.nextDouble();

        // Input temperature in Celsius
        System.out.print("Enter temperature in celsius: ");
        double celsius = input.nextDouble();

        // Input weight in pounds
        System.out.print("Enter wight in pound: ");
        double pound = input.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter weight in km: ");
        double km = input.nextDouble();

        // Input quantity in gallons
        System.out.print("Enter quantity in gallon: ");
        double gallon = input.nextDouble();

        // Input quantity in liters
        System.out.print("Enter quantity in liters: ");
        double liters = input.nextDouble();

        // Perform all conversions
        double result1 = convertFarhenheitToCelsius(farhenheit);
        double result2 = convertCelsiusToFarhenheit(celsius);
        double result3 = convertPondsToKilograms(pound);
        double result4 = convertKilogramsToPounds(km);
        double result5 = convertGallonsToLiters(gallon);
        double result6 = convertLitersToGallon(liters);

        // Display all conversion results
        System.out.println(
                "The distance unit conversion results are: "
                        + result1 + " , "
                        + result2 + " ,  "
                        + result3 + " , "
                        + result4 + " , "
                        + result5 + " and "
                        + result6 + "."
        );
    }
}
