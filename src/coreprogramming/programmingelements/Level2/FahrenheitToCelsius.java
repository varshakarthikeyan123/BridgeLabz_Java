/*
 This program converts temperature from Fahrenheit
 to Celsius.
 It takes the temperature in Fahrenheit as input
 from the user and applies the standard
 conversion formula.
 The program demonstrates user input,
 arithmetic operations, and output in Java.
*/

package CoreProgramming.programmingelements.Level2;

import java.util.Scanner; // imports Scanner class to read input from the user

public class FahrenheitToCelsius {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for user input

        System.out.print("Enter temperature in Celsius: "); // prompts user to enter temperature in Fahrenheit
        double fahrenheit = input.nextDouble(); // reads temperature in Fahrenheit

        double celsiusResult = (fahrenheit - 32) * 5 / 9; // converts Fahrenheit to Celsius

        System.out.println(
                "The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius."
        ); // displays the converted temperature
    }
}
