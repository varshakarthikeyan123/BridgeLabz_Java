package CoreProgramming.Extras;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.print("Enter the substring to search: ");
        String substring = input.nextLine();
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        System.out.println("Occurrence of substring: " + count);
    }
}
