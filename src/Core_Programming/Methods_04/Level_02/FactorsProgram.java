package Core_Programming.Methods_04.Level_02;

import java.util.Scanner;

public class FactorsProgram {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static long productOfFactors(int[] arr) {
        long product = 1;
        for (int x : arr) product *= x;
        return product;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.println("Factors:");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum: " + sumOfFactors(factors));
        System.out.println("Product: " + productOfFactors(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}

