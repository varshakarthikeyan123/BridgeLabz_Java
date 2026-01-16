package CoreProgramming.ExtrasBuiltIn;
import java.util.Scanner;
public class TempConvertor {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " degree C = " + celsiusToFahrenheit(celsius) + "degree F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + "degree F = " + fahrenheitToCelsius(fahrenheit) + "degree C");

    }
}
