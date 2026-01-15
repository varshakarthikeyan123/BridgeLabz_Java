package CoreProgramming.StringFunction.Level1;
import java.util.Scanner;
public class SubString {
    public static String checkSubString(String text, int start, int end) {

        if (start < 0 || end > text.length() || start >= end) {
            return "Invalid index values";
        }

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }
    public static String checkSubString2(String text, int start, int end) {
        return text.substring(start, end);
    }
    public static void main(String[] args){
        Scanner inout = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = inout.nextLine();
        System.out.print("Enter the starting index for the substring: ");
        int start = inout.nextInt();
        System.out.print("Enter the ending index for the substring: ");
        int end = inout.nextInt();
        String check1 = checkSubString(text, start, end);
        String check2 = checkSubString2(text, start, end);
        System.out.println("Substring from method 1: " +check1);
        System.out.println("Substring from method 2: " +check2);
        if ( check1.equals(check2) ) {
            System.out.println("The substrings are from both methods are correct.");
        }
        else{
            System.out.println("The substrings are not from the correct methods.");
        }
    }
}
