package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the input string

        // Loop starts from the last character and moves to the first
        for (int i = text.length() - 1; i >= 0; i--) {

            // Printing characters in reverse order
            System.out.print(text.charAt(i));
        }
    }
}
