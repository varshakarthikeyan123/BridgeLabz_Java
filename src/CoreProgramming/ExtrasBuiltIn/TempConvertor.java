package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class TempConvertor {

    // Method to convert temperature from Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        // Formula: (C × 9 / 5) + 32
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert temperature from Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        // Formula: (F − 32) × 5 / 9
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        // Reading temperature in Celsius

        // Converting Celsius to Fahrenheit using the method
        System.out.println(celsius + " degree C = "
                + celsiusToFahrenheit(celsius) + " degree F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        // Reading temperature in Fahrenheit

        // Converting Fahrenheit to Celsius using the method
        System.out.println(fahrenheit + " degree F = "
                + fahrenheitToCelsius(fahrenheit) + " degree C");
    }
}
