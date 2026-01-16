package CoreProgramming.ArrayPractice.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ClassMarks2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        // Reading number of students

        int[][] marks = new int[students][3];
        // 2D array to store marks
        // Column 0 → Physics
        // Column 1 → Chemistry
        // Column 2 → Maths

        double[] percentage = new double[students];
        // Array to store percentage of each student

        char[] grade = new char[students];
        // Array to store grade of each student

        // Loop to take marks input for each student
        for (int i = 0; i < students; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();
            // Reading Physics marks

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();
            // Reading Chemistry marks

            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();
            // Reading Maths marks

            // Validation: marks should not be negative
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--;
                // Decrement i to re-enter marks for the same student
            }
        }

        // Loop to calculate percentage and assign grades
        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            // Calculating total marks (out of 300)

            percentage[i] = (total / 300.0) * 100;
            // Calculating percentage

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

        // Loop to display marks, percentage, and grade
        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n",
                    marks[i][0],   // Physics
                    marks[i][1],   // Chemistry
                    marks[i][2],   // Maths
                    percentage[i], // Percentage
                    grade[i]);     // Grade
        }

        input.close();
        // Closing Scanner to free resources
    }
}
