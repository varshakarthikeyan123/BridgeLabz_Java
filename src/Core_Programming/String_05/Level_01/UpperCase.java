package CoreProgramming.StringFunction.Level1;
import java.util.Scanner;
public class UpperCase {
    public static String manual(String text){
        String result = " ";
        for ( int i = 0; i < text.length(); i++ ) {
            char ch = text.charAt(i);
            if ( ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }
    public static String inBult(String text){
        return text.toUpperCase();
    }
    public static boolean compare(String text1, String text2){
        if ( text1.length() == text2.length() ) {
            return false;
        }
        for ( int i = 0; i < text1.length(); i++ ) {
            if ( text1.charAt(i) != text2.charAt(i) ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String text1 = manual(text);
        String text2 = inBult(text);
        System.out.println("Upper case by manual method is: " +text1);
        System.out.println("Upper case by inBult method is: " +text2);
        if (compare(text1, text2)) {
            System.out.println("\n The conversion from lower to upper in both the methods is not the same.");
        }
        else{
            System.out.println("\n The conversion from lower to upper in both the methods is the same.");
        }
    }
}

