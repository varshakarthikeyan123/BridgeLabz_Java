/*
 This program checks whether a given string is a palindrome or not.
 It defines a PalindromeChecker class that compares characters from
 the start and end of the string. The main class takes user input
 and displays whether the entered string is a palindrome.
*/
package CoreProgramming.ClassAndObjects.Level2; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class PalindromeChecker { // Defines the PalindromeChecker class

    private String text; // Stores the input text

    public PalindromeChecker(String text) { // Constructor to initialize the text
        this.text = text; // Assigns text to the instance variable
    }

    public boolean isPalindrome() { // Method to check if the string is a palindrome
        int start = 0; // Initializes start index at beginning of string
        int end = text.length() - 1; // Initializes end index at last character

        while (start < end) { // Loops until start index is less than end index
            if (text.charAt(start) != text.charAt(end)) { // Compares characters at start and end
                return false; // Returns false if characters do not match
            }
            start++; // Moves start index forward
            end--; // Moves end index backward
        }
        return true; // Returns true if all characters match
    }

    public void displayResult() { // Method to display palindrome result
        if (isPalindrome()) { // Checks if the text is a palindrome
            System.out.println(text + " is a palindrome."); // Prints palindrome message
        } else {
            System.out.println(text + " is not a palindrome."); // Prints not palindrome message
        }
    }
}

public class palindrome { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter a string: "); // Prompts user to enter a string
        String userText = input.nextLine(); // Reads user input string

        PalindromeChecker checker = new PalindromeChecker(userText); // Creates PalindromeChecker object
        checker.displayResult(); // Displays whether the string is a palindrome
    }
}
