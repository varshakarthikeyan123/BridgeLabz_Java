/*
 This program converts temperature from Celsius
 to Fahrenheit.
 It takes the temperature in Celsius as input
 from the user and applies the standard
 conversion formula.
 The program demonstrates user input,
 arithmetic operations, and output in Java.
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner; // imports Scanner class to read input from the user

public class CelsiusToFahrenheit {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for user input

        System.out.print("Enter temperature in Celsius: "); // prompts user to enter temperature in Celsius
        double celsius = input.nextDouble(); // reads temperature in Celsius

        double fahrenheitResult = (celsius * 9 / 5) + 32; // converts Celsius to Fahrenheit

        System.out.println(
                "The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit."
        ); // displays the converted temperature
    }
}
