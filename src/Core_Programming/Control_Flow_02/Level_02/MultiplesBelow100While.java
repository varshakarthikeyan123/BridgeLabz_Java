package Core_Programming.Control_Flow_02.Level_02;

import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 100;

        if (number > 0 && number < 100) {
            while (counter >= 1) {
                if (counter % number == 0)
                    System.out.println(counter);
                counter--;
            }
        }
    }
}

