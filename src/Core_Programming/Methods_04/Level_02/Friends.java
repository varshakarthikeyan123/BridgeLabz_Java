package Core_Programming.Methods_04.Level_02;

import java.util.Scanner;

public class Friends {

    public static int youngest(int[] age) {
        int min = age[0], index = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < min) {
                min = age[i];
                index = i;
            }
        }
        return index;
    }

    public static int tallest(double[] height) {
        int index = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[index]) index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        System.out.println("Youngest: " + names[youngest(age)]);
        System.out.println("Tallest: " + names[tallest(height)]);
    }
}
