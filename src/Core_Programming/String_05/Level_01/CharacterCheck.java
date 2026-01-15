package CoreProgramming.StringFunction.Level1;
import java.util.Scanner;
public class CharacterCheck {
    public static boolean checkCharacter(String text1, String text2) {
        if (text1.length() != text2.length()) {
            System.out.println("Does not have the same length.");
            return false;
        }
        for ( int i = 0; i < text1.length(); i++ ){
            if ( text1.charAt(i) != text2.charAt(i) ){
                return false;
            }
        }
        return true;
    }
    public static boolean checkEqual( String text1, String text2 ){
        return text1.equals(text2);
    }
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );
        System.out.print( "Enter a string: ");
        String text1 = scan.nextLine();
        System.out.print("Enter another string: ");
        String text2 = scan.nextLine();
        boolean result1 = checkCharacter(text1,text2);
        boolean result2 = checkEqual(text1,text2);
        if ( result1 && result2 ){
            System.out.println( "The strings are equal proved by both methods.");
        }
        else{
            System.out.println("The strings are not equal proved by both methods.");
        }
        System.out.println("charAt() comparison result: " + result1);
        System.out.println("equals() comparison result: " + result2);
    }
}

