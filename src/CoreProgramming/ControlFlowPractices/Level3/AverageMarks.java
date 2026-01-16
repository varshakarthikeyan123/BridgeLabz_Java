package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class AverageMarks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter physics marks: ");
        float physics = input.nextFloat();
        // Reading Physics marks

        System.out.print("Enter chemistry marks: ");
        float chemistry = input.nextFloat();
        // Reading Chemistry marks

        System.out.print("Enter maths marks: ");
        float math = input.nextFloat();
        // Reading Maths marks

        float average = (physics + chemistry + math) / 3;
        // Calculating average of three subjects

        // Assigning grade based on average marks
        if (average >= 80) {
            System.out.println("Grade: A; Level 4, above agency-normalized standards");
        }
        else if (average >= 70 && average <= 79) {
            System.out.println("Grade: B; Level 3, at agency-normalized standards");
        }
        else if (average >= 60 && average <= 69) {
            System.out.println("Grade: C; Level 2, below, but approaching agency-normalized standards");
        }
        else if (average >= 50 && average <= 59) {
            System.out.println("Grade: D; Level 1, well below agency-normalized standards");
        }
        else if (average >= 40 && average <= 49) {
            System.out.println("Grade: E; Level 1-, too below agency-normalized standards");
        }
        else {
            System.out.println("Grade: R; Remedial standards");
            // R grade indicates the student needs improvement
        }
    }
}
