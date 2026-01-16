package CoreProgramming.Extras;
import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if ( ch == 'a' || ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("The number of vowels in the given string is: " +vowels);
        System.out.println("The number of consonants in the given string is: " +consonants);
    }
}
