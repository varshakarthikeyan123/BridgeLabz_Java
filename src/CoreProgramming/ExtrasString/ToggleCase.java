package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ToggleCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the input string

        String result = "";
        // This string will store the final toggled result

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            // Current character from the string

            // If character is lowercase, convert it to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            }
            // If character is uppercase, convert it to lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            }
            // If character is not an alphabet, keep it unchanged
            else {
                result += ch;
            }
        }

        // Printing the toggled case string
        System.out.println("The toggled cases are: " + result);
    }
}
