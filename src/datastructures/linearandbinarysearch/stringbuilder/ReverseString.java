package datastructures.linearandbinarysearch.stringbuilder;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Reverse a given string using StringBuilder.

         Approach:
         - Create a StringBuilder object and append the input string.
         - Use the reverse() method of StringBuilder.
         - Convert the reversed StringBuilder back to a string and display it.
        */

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create StringBuilder and reverse
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse(); // reverse the string

        // Convert back to String
        String reversed = sb.toString();

        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
