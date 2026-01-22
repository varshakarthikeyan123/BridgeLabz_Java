package datastructures.linearandbinarysearch.stringbuilder;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Remove all duplicate characters from a string while maintaining the original order.

         Approach:
         - Initialize an empty StringBuilder and a HashSet.
         - Iterate through each character in the string:
             - If the character is not in the HashSet:
                 - Append it to StringBuilder.
                 - Add it to the HashSet.
         - Convert StringBuilder to string and display the result.
        */

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                sb.append(c);      // add character if not seen
                seen.add(c);       // mark character as seen
            }
        }

        String result = sb.toString();
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
