package Core_Programming.Methods_04.Level_01;

import java.util.Scanner;

public class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] res = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + res[0]);
        System.out.println("Remainder: " + res[1]);
    }
}

