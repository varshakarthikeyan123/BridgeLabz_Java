/*
 This program converts temperature from Celsius to Fahrenheit
 using the formula: (C × 9/5) + 32
*/
package coreprogramming.practiceproblems.assistedproblems;

import java.util.Scanner; // Importing Scanner class for user input

public class TempConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter temperature in Celsius: "); // Asking user for Celsius value
        double celsius = input.nextDouble(); // Reading Celsius temperature

        double fahrenheit = (celsius * 9 / 5) + 32; // Converting Celsius to Fahrenheit

        System.out.println(
                "The temperature in Fahrenheit is: " + fahrenheit + " degrees F"
        ); // Displaying the converted temperature
    }
}
