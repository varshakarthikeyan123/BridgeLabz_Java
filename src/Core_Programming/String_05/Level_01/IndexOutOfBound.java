package CoreProgramming.StringFunction.Level1;
import java.util.Scanner;
public class IndexOutOfBound {
    public static void exceptionMethod(String text){
        char ch = text.charAt(text.length());
        System.out.println(ch);
    }
    public static void handleException(String text){
        try{
            char ch = text.charAt(text.length());
            System.out.println(ch);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Invalid index accessed");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        exceptionMethod(text);
        handleException(text);
    }
}
