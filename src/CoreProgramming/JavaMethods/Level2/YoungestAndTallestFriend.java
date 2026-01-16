package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;

public class YoungestAndTallestFriend {

    // Method to determine the youngest friend based on ages
    public static String youngestFriend(int amarAge, int akbarAge, int anthonyAge) {

        // Check if Amar is younger than both Akbar and Anthony
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            return "Amar";
        }
        // Check if Akbar is younger than both Amar and Anthony
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            return "Akbar";
        }
        // Check if Anthony is younger than both Amar and Akbar
        else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            return "Anthony";
        }
        // If two or more ages are equal
        else {
            return "Same age";
        }
    }

    // Method to determine the tallest friend based on heights
    public static String tallestFriend(float amarHeight, float akbarHeight, float anthonyHeight) {

        // Check if Amar is taller than both Akbar and Anthony
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            return "Amar";
        }
        // Check if Akbar is taller than both Amar and Anthony
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            return "Akbar";
        }
        // Check if Anthony is taller than both Amar and Akbar
        else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            return "Anthony";
        }
        // If two or more heights are equal
        else {
            return "Same height";
        }
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read ages of Amar, Akbar, and Anthony
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Read heights of Amar, Akbar, and Anthony
        System.out.print("Enter Amar's height: ");
        float amarHeight = input.nextFloat();

        System.out.print("Enter Akbar's height: ");
        float akbarHeight = input.nextFloat();

        System.out.print("Enter Anthony's height: ");
        float anthonyHeight = input.nextFloat();

        // Determine the youngest friend
        String youngest = youngestFriend(amarAge, akbarAge, anthonyAge);

        // Determine the tallest friend
        String tallest = tallestFriend(amarHeight, akbarHeight, anthonyHeight);

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
