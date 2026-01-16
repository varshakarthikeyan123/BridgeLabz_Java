package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;

public class NumberCheck4 {

    public static boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean neonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean spyNumber(int number) {
        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean automorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean buzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Is Prime Number: " + primeNumber(number));
        System.out.println("Is Neon Number: " + neonNumber(number));
        System.out.println("Is Spy Number: " + spyNumber(number));
        System.out.println("Is Automorphic Number: " + automorphicNumber(number));
        System.out.println("Is Buzz Number: " + buzzNumber(number));
    }
}

