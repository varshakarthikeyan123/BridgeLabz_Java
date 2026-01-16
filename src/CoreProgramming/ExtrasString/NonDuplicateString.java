package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class NonDuplicateString {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String text) {

        String result = "";
        // Stores the final string without duplicate characters

        // Loop through each character of the input string
        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            // Current character being checked

            boolean found = false;
            // Flag to check if character already exists in result

            // Loop through result string to check for duplicates
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    found = true;
                    break;
                }
            }

            // If character is not found, add it to result
            if (!found) {
                result += current;
            }
        }

        return result;
        // Returning the string without duplicates
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a string: ");
        String text = scan.nextLine();
        // Reading input string

        String output = removeDuplicates(text);
        // Calling method to remove duplicate characters

        System.out.println("String after removing duplicates: " + output);
        // Printing the final result
    }
}
