package CoreProgramming.Extras;
import java.util.Scanner;
public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = input.nextLine();

        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        int i = 0;
        int minLength = Math.min(s1.length(), s2.length());

        while (i < minLength) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                System.out.println("First string " +s1 + " comes before second string " + s2 + ".\n");
                input.close();
                return;
            } else if (c1 > c2) {
                System.out.println("First string " +s1 + " comes after second string " + s2 + ".\n");
                input.close();
                return;
            }
            i++;
        }

        if (s1.length() < s2.length()) {
            System.out.println("First string comes before second string");
        } else if (s1.length() > s2.length()) {
            System.out.println("First string comes after second string");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}

