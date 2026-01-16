package CoreProgramming.StringFunctions.Level2;
import java.util.Scanner;
public class VowelsConsonants {
    public static int[] vowelConsonants(String text){
        int vowels = 0;
        int consonants = 0;
        String lower =  text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scan.nextLine();
        int[] count =  vowelConsonants(text);
        System.out.println("The count of vowels in the string: " +count[0]);
        System.out.println("The count of consonants in the string: " +count[1]);
    }
}

