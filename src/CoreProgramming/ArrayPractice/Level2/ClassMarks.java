package CoreProgramming.ArrayPractice.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ClassMarks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        // Reading the number of students

        int[] physics = new int[students];
        // Array to store Physics marks of students

        int[] chemistry = new int[students];
        // Array to store Chemistry marks of students

        int[] maths = new int[students];
        // Array to store Maths marks of students

        double[] percentage = new double[students];
        // Array to store percentage of each student

        char[] grade = new char[students];
        // Array to store grade of each student

        // Loop to take marks input for each student
        for (int i = 0; i < students; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextInt();
            // Reading Physics marks

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();
            // Reading Chemistry marks

            System.out.print("Maths: ");
            maths[i] = input.nextInt();
            // Reading Maths marks

            // Validation: marks should not be negative
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--;
                // Decrementing i to re-enter marks for the same student
            }
        }

        // Loop to calculate percentage and assign grades
        for (int i = 0; i < students; i++) {

            int total = physics[i] + chemistry[i] + maths[i];
            // Calculating total marks

            percentage[i] = (total / 300.0) * 100;
            // Calculating percentage (out of 300)

            // Assigning grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            }
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            }
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            }
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
            }
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            }
            else {
                grade[i] = 'R';
                // R indicates Reappear / Fail
            }
        }

        // Displaying marks, percentage, and grade
        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n",
                    physics[i],
                    chemistry[i],
                    maths[i],
                    percentage[i],
                    grade[i]);
        }

        input.close();
        // Closing Scanner to free resources
    }
}
