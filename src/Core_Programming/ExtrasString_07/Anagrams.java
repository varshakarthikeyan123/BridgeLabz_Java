package CoreProgramming.Extras;
import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("The strings are NOT anagrams.");
            input.close();
            return;
        }
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int freq1 = 0;
            int freq2 = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == ch)
                    freq1++;
                if (s2.charAt(j) == ch)
                    freq2++;
            }
            if (freq1 == freq2) {
                count++;
            }
        }
        if (count == s1.length()) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
