package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Palindrome {

    // Method to check whether the given string is a palindrome
    public static boolean checkPalindrome(String text) {

        int start = 0;
        // Index pointing to the start of the string

        int end = text.length() - 1;
        // Index pointing to the end of the string

        // Loop until both pointers meet in the middle
        while (start < end) {

            // If characters at start and end do not match, not a palindrome
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            // Move start pointer forward

            end--;
            // Move end pointer backward
        }

        return true;
        // All characters matched, string is a palindrome
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the input string

        boolean check = checkPalindrome(text);
        // Calling palindrome check method

        // Printing result based on returned value
        if (check) {
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
