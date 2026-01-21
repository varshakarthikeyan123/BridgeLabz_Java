/*
 This program performs temperature conversion.
 It converts:
 1) Celsius to Fahrenheit
 2) Fahrenheit to Celsius
 The program uses methods to demonstrate code reuse and clarity.
*/
package CoreProgramming.extrasbuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class TempConvertor {

    // Method to convert temperature from Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        // Applying conversion formula: (C × 9 / 5) + 32
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert temperature from Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        // Applying conversion formula: (F − 32) × 5 / 9
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read input from the keyboard

        System.out.print("Enter temperature in Celsius: ");
        // Prompting the user to enter temperature in Celsius

        double celsius = scanner.nextDouble();
        // Reading Celsius temperature from user

        System.out.println(celsius + " degree C = "
                + celsiusToFahrenheit(celsius) + " degree F");
        // Converting Celsius to Fahrenheit and displaying the result

        System.out.print("Enter temperature in Fahrenheit: ");
        // Prompting the user to enter temperature in Fahrenheit

        double fahrenheit = scanner.nextDouble();
        // Reading Fahrenheit temperature from user

        System.out.println(fahrenheit + " degree F = "
                + fahrenheitToCelsius(fahrenheit) + " degree C");
        // Converting Fahrenheit to Celsius and displaying the result

        scanner.close();
        // Closing Scanner to release system resources
    }
}
