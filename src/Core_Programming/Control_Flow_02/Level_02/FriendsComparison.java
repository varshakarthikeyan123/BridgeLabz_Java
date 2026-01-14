package Core_Programming.Control_Flow_02.Level_02;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        int amarHeight = input.nextInt();
        int akbarHeight = input.nextInt();
        int anthonyHeight = input.nextInt();

        if (amarAge <= akbarAge && amarAge <= anthonyAge)
            System.out.println("Amar is the youngest");
        else if (akbarAge <= amarAge && akbarAge <= anthonyAge)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight)
            System.out.println("Amar is the tallest");
        else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }
}

