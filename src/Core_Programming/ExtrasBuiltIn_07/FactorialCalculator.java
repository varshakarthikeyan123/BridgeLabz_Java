package CoreProgramming.ExtrasBuiltIn;
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        int number = getInput();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate factorial: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers. Exiting.");
            System.exit(0);
        }
        return num;
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void displayResult(int num, long factorial) {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}

