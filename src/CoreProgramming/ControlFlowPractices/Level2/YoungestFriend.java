package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class YoungestFriend {

    // Method to find and return the youngest age among three friends
    public static int youngestFriend(int amarAge, int akbarAge, int anthonyAge) {

        // Checking if Amar is the youngest
        if (amarAge < anthonyAge && amarAge < akbarAge) {
            return amarAge;
        }
        // Checking if Akbar is the youngest
        else if (akbarAge < anthonyAge && akbarAge < amarAge) {
            return akbarAge;
        }
        // Checking if Anthony is the youngest
        else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            return anthonyAge;
        }
        // This case occurs when two or more ages are equal
        else {
            return 0;
            // Returning 0 to indicate no unique youngest friend
        }
    }

    // Method to find and return the tallest height among three friends
    public static float tallestFriend(float amarHeight, float akbarHeight, float anthonyHeight) {

        // Checking if Amar is the tallest
        if (amarHeight > anthonyHeight && amarHeight > akbarHeight) {
            return amarHeight;
        }
        // Checking if Akbar is the tallest
        else if (akbarHeight > anthonyHeight && akbarHeight > amarHeight) {
            return akbarHeight;
        }
        // Checking if Anthony is the tallest
        else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            return anthonyHeight;
        }
        // This case occurs when two or more heights are equal
        else {
            return 0;
            // Returning 0 to indicate no unique tallest friend
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter amar's age: ");
        int amarAge = input.nextInt();
        // Reading Amar's age

        System.out.print("Enter akbar's age: ");
        int akbarAge = input.nextInt();
        // Reading Akbar's age

        System.out.print("Enter anthony's age: ");
        int anthonyAge = input.nextInt();
        // Reading Anthony's age

        System.out.print("Enter amar's height: ");
        float amarHeight = input.nextFloat();
        // Reading Amar's height

        System.out.print("Enter akbar's height: ");
        float akbarHeight = input.nextFloat();
        // Reading Akbar's height

        System.out.print("Enter anthony's height: ");
        float anthonyHeight = input.nextFloat();
        // Reading Anthony's height

        int age = youngestFriend(amarAge, akbarAge, anthonyAge);
        // Calling method to find youngest age

        float height = tallestFriend(amarHeight, akbarHeight, anthonyHeight);
        // Calling method to find tallest height

        System.out.println("The youngest friend is " + age);
        System.out.println("The tallest friend is " + height);
    }
}
