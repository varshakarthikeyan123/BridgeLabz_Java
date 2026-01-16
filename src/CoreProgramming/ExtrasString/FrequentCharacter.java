package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FrequentCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Reading the input string

        int count = 0;
        // Variable to count occurrences of a character

        int maxCount = 0;
        // Stores the highest frequency found so far

        char mostFrequent = ' ';
        // Stores the most frequent character

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            // Current character being checked

            // Incrementing count (logic as written)
            if (text.charAt(i) == ch) {
                count++;
            }

            // Updating maxCount and mostFrequent character
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ch;
            }
        }

        // Printing the most frequent character
        System.out.println("Most frequent character: '" + mostFrequent + "'");
    }
}
