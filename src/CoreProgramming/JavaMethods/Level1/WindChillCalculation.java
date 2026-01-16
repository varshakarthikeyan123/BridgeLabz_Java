package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class WindChillCalculation {

    // Method to calculate wind chill based on temperature and wind speed
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        // Wind chill formula using temperature and wind speed

        return windChill;
        // Returning calculated wind chill value
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        // Reading temperature value

        System.out.print("Enter windspeed: ");
        double windSpeed = input.nextDouble();
        // Reading wind speed value

        double result = calculateWindChill(temperature, windSpeed);
        // Calling method to calculate wind chill

        System.out.println("The wind chill was calculated to be: " + result);
        // Printing the wind chill result
    }
}
