package CoreProgramming.StringFunction.Level1;
import java.util.Scanner;
public class NumberFormatExceptionDemo {

    public static void generateException(String text) {
        System.out.println("\nGenerating NumberFormatException...");
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    public static void handleException(String text) {
        System.out.println("\nHandling NumberFormatException...");
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: NumberFormatException");
            System.out.println("Input text does not contain a valid number");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scan.nextLine();
        generateException(text);
        handleException(text);
    }
}

