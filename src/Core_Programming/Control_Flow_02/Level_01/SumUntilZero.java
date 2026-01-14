package Core_Programming.Control_Flow_02.Level_01;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;

        while (true) {
            value = input.nextDouble();
            if (value == 0)
                break;
            total += value;
        }
        System.out.println("The total sum is " + total);
    }
}
