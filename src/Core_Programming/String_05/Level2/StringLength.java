package CoreProgramming.StringFunctions.Level2;
import java.util.Scanner;
public class StringLength {
    public static int stringLen(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e){

        }
        return count;
    }
    public static int stringLen2(String text){
        return text.length();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        int result1  = stringLen(text);
        int result2  = stringLen2(text);
        System.out.println("The length of string without using in-built method: " + result1);
        System.out.println("The length of string by using in-built method: " + result2);
    }
}
