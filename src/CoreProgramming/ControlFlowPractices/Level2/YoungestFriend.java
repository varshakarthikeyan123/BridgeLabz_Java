/*
 This program finds the youngest and tallest friend among Amar, Akbar, and Anthony.
 It uses methods, conditional statements, and user input to compare ages and heights
 and display the results.
*/
package CoreProgramming.ControlFlowPractices.Level2;
// Package declaration for Level 2 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class YoungestFriend {
    // Main class that contains methods and the main execution logic

    // Method to find and return the youngest age among three friends
    public static int youngestFriend(int amarAge, int akbarAge, int anthonyAge) {
        // Method that compares ages and returns the smallest one

        // Checking if Amar is the youngest
        if (amarAge < anthonyAge && amarAge < akbarAge) {
            return amarAge;
            // Returning Amar's age as the youngest
        }
        // Checking if Akbar is the youngest
        else if (akbarAge < anthonyAge && akbarAge < amarAge) {
            return akbarAge;
            // Returning Akbar's age as the youngest
        }
        // Checking if Anthony is the youngest
        else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            return anthonyAge;
            // Returning Anthony's age as the youngest
        }
        // This case occurs when two or more ages are equal
        else {
            return 0;
            // Returning 0 to indicate no unique youngest friend
        }
    }

    // Method to find and return the tallest height among three friends
    public static float tallestFriend(float amarHeight, float akbarHeight, float anthonyHeight) {
        // Method that compares heights and returns the tallest one

        // Checking if Amar is the tallest
        if (amarHeight > anthonyHeight && amarHeight > akbarHeight) {
            return amarHeight;
            // Returning Amar's height as the tallest
        }
        // Checking if Akbar is the tallest
        else if (akbarHeight > anthonyHeight && akbarHeight > amarHeight) {
            return akbarHeight;
            // Returning Akbar's height as the tallest
        }
        // Checking if Anthony is the tallest
        else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            return anthonyHeight;
            // Returning Anthony's height as the tallest
        }
        // This case occurs when two or more heights are equal
        else {
            return 0;
            // Returning 0 to indicate no unique tallest friend
        }
    }

    public static void main(String[] args) {
        // Main method where program execution begins

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter amar's age: ");
        // Prompting user to enter Amar's age
        int amarAge = input.nextInt();
        // Reading Amar's age

        System.out.print("Enter akbar's age: ");
        // Prompting user to enter Akbar's age
        int akbarAge = input.nextInt();
        // Reading Akbar's age

        System.out.print("Enter anthony's age: ");
        // Prompting user to enter Anthony's age
        int anthonyAge = input.nextInt();
        // Reading Anthony's age

        System.out.print("Enter amar's height: ");
        // Prompting user to enter Amar's height
        float amarHeight = input.nextFloat();
        // Reading Amar's height

        System.out.print("Enter akbar's height: ");
        // Prompting user to enter Akbar's height
        float akbarHeight = input.nextFloat();
        // Reading Akbar's height

        System.out.print("Enter anthony's height: ");
        // Prompting user to enter Anthony's height
        float anthonyHeight = input.nextFloat();
        // Reading Anthony's height

        int age = youngestFriend(amarAge, akbarAge, anthonyAge);
        // Calling method to find the youngest friend's age

        float height = tallestFriend(amarHeight, akbarHeight, anthonyHeight);
        // Calling method to find the tallest friend's height

        System.out.println("The youngest friend is " + age);
        // Displaying the youngest friend's age

        System.out.println("The tallest friend is " + height);
        // Displaying the tallest friend's height
    }
}
