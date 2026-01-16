package CoreProgramming.Extras;
import java.util.Scanner;
public class NonDuplicateString {

    public static String removeDuplicates(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scan.nextLine();

        String output = removeDuplicates(text);

        System.out.println("String after removing duplicates: " + output);
    }
}
