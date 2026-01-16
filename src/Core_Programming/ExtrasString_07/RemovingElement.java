package CoreProgramming.Extras;
import java.util.Scanner;
public class RemovingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.print("Enter a character to remove: ");
        char character = input.next().charAt(0);
        String result = "";
        for  (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != character) {
                result += text.charAt(i);
            }
        }
        System.out.println(result);
    }
}
