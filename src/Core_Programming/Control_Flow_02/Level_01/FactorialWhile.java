package Core_Programming.Control_Flow_02.Level_01;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            int fact = 1;
            int i = 1;

            while (i <= number) {
                fact *= i;
                i++;
            }
            System.out.println("The factorial is " + fact);
        }
    }
}