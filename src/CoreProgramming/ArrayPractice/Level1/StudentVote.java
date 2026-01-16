package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;
public class StudentVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];
        System.out.print("Enter age of 10 students: ");
        for (int i = 0; i < 10; i++) {
            age[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(age[i] + " ");
        }
        for ( int i = 0; i < 10; i++) {
            if ( age[i] < 0 ){
                System.out.println("The number entered is negative.");
            }
            else if ( age[i] >= 18 ){
                System.out.println("The student with age " +age[i] +" can vote.");
            }
            else{
                System.out.println("The student with age " +age[i] +" cannot vote.");
            }
        }
    }
}

