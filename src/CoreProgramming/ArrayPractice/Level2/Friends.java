package CoreProgramming.ArrayPractice.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Friends {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        String[] names = {"Amar", "Akbar", "Anthony"};
        // Array storing names of the friends

        int size = 3;
        // Number of friends

        double[] age = new double[size];
        // Array to store age of each friend

        double[] height = new double[size];
        // Array to store height of each friend

        // Loop to take age and height input for each friend
        for (int i = 0; i < size; i++) {

            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter age: ");
            age[i] = input.nextDouble();
            // Reading age

            System.out.print("Enter height: ");
            height[i] = input.nextDouble();
            // Reading height

            // Validation: age and height must be positive
            if (height[i] <= 0 || age[i] <= 0) {
                System.out.println("The age and height entered is invalid.");
                i--;
                // Decrement i to re-enter details for the same friend
                continue;
                // Skip remaining code in this iteration
            }
        }

        int youngestIndex = 0;
        // Stores index of the youngest friend

        int tallestIndex = 0;
        // Stores index of the tallest friend

        // Loop to find youngest and tallest friend
        for (int i = 0; i < size; i++) {

            // Checking for youngest friend
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            // Checking for tallest friend
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest friend: " + names[youngestIndex]
                + " (Age: " + age[youngestIndex] + ")");

        System.out.println("Tallest friend: " + names[tallestIndex]
                + " (Height: " + height[tallestIndex] + ")");
    }
}
