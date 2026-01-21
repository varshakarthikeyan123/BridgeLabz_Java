/*
 This program stores details of three friends.
 It takes age and height as input, validates the data,
 and then finds and displays the youngest and tallest friend.
*/
package coreprogramming.arraypractice.level2; // Defines the package for Level 2 array practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class Friends { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        String[] names = {"Amar", "Akbar", "Anthony"};
        // Array storing names of the friends

        int size = 3;
        // Stores the number of friends

        double[] age = new double[size];
        // Array to store age of each friend

        double[] height = new double[size];
        // Array to store height of each friend

        // Loop to take age and height input for each friend
        for (int i = 0; i < size; i++) {

            System.out.println("\nEnter details for " + names[i]);
            // Displays which friend's details are being entered

            System.out.print("Enter age: ");
            age[i] = input.nextDouble();
            // Reads and stores age

            System.out.print("Enter height: ");
            height[i] = input.nextDouble();
            // Reads and stores height

            // Validation to ensure age and height are positive
            if (height[i] <= 0 || age[i] <= 0) {
                System.out.println("The age and height entered is invalid.");
                i--;
                // Decrements index to re-enter details for the same friend
                continue;
                // Skips remaining code in this iteration
            }
        }

        int youngestIndex = 0;
        // Stores index of the youngest friend

        int tallestIndex = 0;
        // Stores index of the tallest friend

        // Loop to find the youngest and tallest friend
        for (int i = 0; i < size; i++) {

            // Checking for youngest friend
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
                // Updates index of youngest friend
            }

            // Checking for tallest friend
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
                // Updates index of tallest friend
            }
        }

        System.out.println("\nYoungest friend: " + names[youngestIndex]
                + " (Age: " + age[youngestIndex] + ")");
        // Displays youngest friend's name and age

        System.out.println("Tallest friend: " + names[tallestIndex]
                + " (Height: " + height[tallestIndex] + ")");
        // Displays tallest friend's name and height
    }
}
