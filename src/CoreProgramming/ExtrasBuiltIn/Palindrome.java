package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Palindrome {

    // Method to check whether a given string is a palindrome
    public static boolean checkPalindrome(String text) {

        int start = 0;
        // Pointer starting from the beginning of the string

        int end = text.length() - 1;
        // Pointer starting from the end of the string

        // Loop continues until both pointers meet
        while (start < end) {

            // If characters at start and end positions do not match,
            // the string is not a palindrome
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            // Moving start pointer forward

            end--;
            // Moving end pointer backward
        }

        return true;
        // If all characters matched, the string is a palindrome
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the string input

        boolean check = checkPalindrome(text);
        // Calling the palindrome check method

        // Displaying result based on returned value
        if (check) {
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
