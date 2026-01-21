/*
 This program determines:
 1) The youngest friend among Amar, Akbar, and Anthony based on their ages
 2) The tallest friend among Amar, Akbar, and Anthony based on their heights
 It takes user input for ages and heights, compares them using methods,
 and prints the youngest and tallest friend.
*/
package CoreProgramming.javamethods.level2;
// Package declaration for Java Methods Level 2 programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class YoungestAndTallestFriend {
    // Class to find the youngest and tallest friend

    // Method to determine the youngest friend based on ages
    public static String youngestFriend(int amarAge, int akbarAge, int anthonyAge) {

        // Checking if Amar is younger than both Akbar and Anthony
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            return "Amar";
            // Returning Amar as the youngest
        }
        // Checking if Akbar is younger than both Amar and Anthony
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            return "Akbar";
            // Returning Akbar as the youngest
        }
        // Checking if Anthony is younger than both Amar and Akbar
        else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            return "Anthony";
            // Returning Anthony as the youngest
        }
        // Case where two or more friends have the same age
        else {
            return "Same age";
            // Returning message for equal ages
        }
    }

    // Method to determine the tallest friend based on heights
    public static String tallestFriend(float amarHeight, float akbarHeight, float anthonyHeight) {

        // Checking if Amar is taller than both Akbar and Anthony
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            return "Amar";
            // Returning Amar as the tallest
        }
        // Checking if Akbar is taller than both Amar and Anthony
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            return "Akbar";
            // Returning Akbar as the tallest
        }
        // Checking if Anthony is taller than both Amar and Akbar
        else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            return "Anthony";
            // Returning Anthony as the tallest
        }
        // Case where two or more friends have the same height
        else {
            return "Same height";
            // Returning message for equal heights
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        // Reading Amar's age

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        // Reading Akbar's age

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        // Reading Anthony's age

        System.out.print("Enter Amar's height: ");
        float amarHeight = input.nextFloat();
        // Reading Amar's height

        System.out.print("Enter Akbar's height: ");
        float akbarHeight = input.nextFloat();
        // Reading Akbar's height

        System.out.print("Enter Anthony's height: ");
        float anthonyHeight = input.nextFloat();
        // Reading Anthony's height

        String youngest = youngestFriend(amarAge, akbarAge, anthonyAge);
        // Calling method to find the youngest friend

        String tallest = tallestFriend(amarHeight, akbarHeight, anthonyHeight);
        // Calling method to find the tallest friend

        System.out.println("The youngest friend is: " + youngest);
        // Printing the youngest friend

        System.out.println("The tallest friend is: " + tallest);
        // Printing the tallest friend

        input.close();
        // Closing the Scanner
    }
}
