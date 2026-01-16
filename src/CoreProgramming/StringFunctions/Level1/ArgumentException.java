package CoreProgramming.StringFunctions.Level1;
import java.util.Scanner;
public class ArgumentException {
    public static void exceptionMethod(String text) {
        String result = text.substring(5,2);
        System.out.println(result);
    }
    public static void handleException(String text) {
        try{
            String result = text.substring(5,2);
            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception caught: IllegalArgumentException");
            System.out.println("Start index cannot be greater than end index");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = input.nextLine();
        exceptionMethod(text);
        handleException(text);
    }
}
