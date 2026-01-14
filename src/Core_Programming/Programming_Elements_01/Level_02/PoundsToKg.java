package Core_Programming.Programming_Elements_01.Level_02;

import java.util.Scanner;

public class PoundsToKg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weightPound = input.nextDouble();
        double weightKg = weightPound / 2.2;

        System.out.println("The weight of the person in pound is " +
                weightPound + " and in kg is " + weightKg);
    }
}

