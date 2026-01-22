package datastructures.linearandbinarysearch.stringbuffer;
import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Concatenate all strings in an array efficiently using StringBuffer.

         Approach:
         - Create a new StringBuffer object.
         - Iterate through each string in the array:
             - Append the string to the StringBuffer.
         - Convert the StringBuffer to a string and display the result.
        */

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextLine();

        StringBuffer sb = new StringBuffer();

        // Append all strings in the array
        for (String str : arr) sb.append(str);

        String result = sb.toString();
        System.out.println("Concatenated string: " + result);
        sc.close();
    }
}
