package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class RemovingElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the input string

        System.out.print("Enter a character to remove: ");
        char character = input.next().charAt(0);
        // Reading the character to be removed

        String result = "";
        // This string will store the final result after removal

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            // Current character in the string

            // Add character to result only if it does not match the given character
            if (ch != character) {
                result += text.charAt(i);
            }
        }

        // Printing the final string after removal
        System.out.println(result);
    }
}
