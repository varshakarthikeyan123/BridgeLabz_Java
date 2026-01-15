package CoreProgramming.StringFunction.Level2;
import java.util.Scanner;
public class TrimUsingCharAt {
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }
    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();
        int[] indices = findTrimIndices(input);
        String trimmedUsingCharAt = substringUsingCharAt(
                input, indices[0], indices[1]);
        String trimmedUsingBuiltIn = input.trim();
        boolean isSame = compareStringsUsingCharAt(
                trimmedUsingCharAt, trimmedUsingBuiltIn);
        System.out.println("Trimmed using charAt(): " +trimmedUsingCharAt );
        System.out.println("Trimmed using built-in trim(): " + trimmedUsingBuiltIn);
        System.out.println("Are both strings equal? " + isSame);
    }
}
