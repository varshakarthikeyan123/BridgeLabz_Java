package CoreProgramming.StringFunction.Level1;
import java.util.Scanner;
public class LowerCase {
    public static String manual(String text){
        String result = " ";
        for ( int i = 0; i < text.length(); i++ ){
            char ch = text.charAt(i);
            if ( ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }
    public static String inBuilt(String text){
        return text.toLowerCase();
    }
    public static boolean check(String text1, String text2){
        if ( text1.length() != text2.length() ){
            return false;
        }
        for ( int i = 0; i < text1.length(); i++ ){
            if (text1.charAt(i) != text2.charAt(i)) {
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
        String text2 = inBuilt(text);
        System.out.println("Lower case by manual method: " +text1);
        System.out.println("Lower case by inbuilt method: " +text2);
        if (check(text1, text2)){
            System.out.println("\n the lower case string provided by both the methods are not the same.");
        }
        else{
            System.out.println("\n the lower case string provided by both the methods are the same.");
        }
    }
}
