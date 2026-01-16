package CoreProgramming.Extras;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Anagrams {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object for user input

        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        // Reading first string

        System.out.print("Enter second string: ");
        String s2 = input.nextLine();
        // Reading second string

        // Removing spaces and converting to lowercase to standardize comparison
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        // If lengths are different, strings cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("The strings are NOT anagrams.");
            input.close();
            return;
        }

        int count = 0;
        // Variable to count matching character frequencies

        // Loop through each character in the first string
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);
            // Current character to compare

            int freq1 = 0;
            int freq2 = 0;
            // Frequency counters for both strings

            // Counting frequency of ch in both strings
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == ch)
                    freq1++;
                if (s2.charAt(j) == ch)
                    freq2++;
            }

            // If frequency matches, increment count
            if (freq1 == freq2) {
                count++;
            }
        }

        // If all characters have matching frequencies, strings are anagrams
        if (count == s1.length()) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
