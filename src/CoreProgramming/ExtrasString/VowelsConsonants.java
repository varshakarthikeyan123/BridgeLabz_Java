package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class VowelsConsonants {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the input string

        int vowels = 0;
        // Counter for vowels

        int consonants = 0;
        // Counter for consonants

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            // Current character from the string

            // Checking if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // All other characters are counted as consonants (as per given logic)
            else {
                consonants++;
            }
        }

        // Printing the count of vowels and consonants
        System.out.println("The number of vowels in the given string is: " + vowels);
        System.out.println("The number of consonants in the given string is: " + consonants);
    }
}
