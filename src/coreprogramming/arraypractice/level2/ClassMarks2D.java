/*
 This program manages student marks using a 2D array.
 It stores Physics, Chemistry, and Maths marks for each student,
 validates input, calculates percentage, assigns grades,
 and displays the final result in a tabular format.
*/
package coreprogramming.arraypractice.level2; // Defines the package for Level 2 array practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class ClassMarks2D { // Main class definition
    public static void main(String[] args) { // Main method where program execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        System.out.print("Enter number of students: "); // Prompting user for number of students
        int students = input.nextInt(); // Reading number of students

        int[][] marks = new int[students][3]; // 2D array to store marks of 3 subjects for each student
        // marks[i][0] → Physics, marks[i][1] → Chemistry, marks[i][2] → Maths

        double[] percentage = new double[students]; // Array to store percentage of each student

        char[] grade = new char[students]; // Array to store grade of each student

        // Loop to take marks input for each student
        for (int i = 0; i < students; i++) { // Iterates through each student

            System.out.println("\nEnter marks for Student " + (i + 1)); // Displays student number

            System.out.print("Physics: "); // Prompt for Physics marks
            marks[i][0] = input.nextInt(); // Reading Physics marks

            System.out.print("Chemistry: "); // Prompt for Chemistry marks
            marks[i][1] = input.nextInt(); // Reading Chemistry marks

            System.out.print("Maths: "); // Prompt for Maths marks
            marks[i][2] = input.nextInt(); // Reading Maths marks

            // Validation to ensure marks are not negative
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) { // Checks for invalid input
                System.out.println("Invalid marks! Enter positive values only."); // Error message
                i--; // Decrements index to re-enter marks for same student
            }
        }

        // Loop to calculate percentage and assign grades
        for (int i = 0; i < students; i++) { // Iterates through each student

            int total = marks[i][0] + marks[i][1] + marks[i][2]; // Calculates total marks out of 300

            percentage[i] = (total / 300.0) * 100; // Calculates percentage

            // Assigning grade based on percentage
            if (percentage[i] >= 80) { // Grade A condition
                grade[i] = 'A'; // Assigns grade A
            }
            else if (percentage[i] >= 70) { // Grade B condition
                grade[i] = 'B'; // Assigns grade B
            }
            else if (percentage[i] >= 60) { // Grade C condition
                grade[i] = 'C'; // Assigns grade C
            }
            else if (percentage[i] >= 50) { // Grade D condition
                grade[i] = 'D'; // Assigns grade D
            }
            else if (percentage[i] >= 40) { // Grade E condition
                grade[i] = 'E'; // Assigns grade E
            }
            else { // Fail condition
                grade[i] = 'R'; // R indicates Reappear / Fail
            }
        }

        // Loop to display marks, percentage, and grade for each student
        for (int i = 0; i < students; i++) { // Iterates through each student
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n",
                    marks[i][0],   // Displays Physics marks
                    marks[i][1],   // Displays Chemistry marks
                    marks[i][2],   // Displays Maths marks
                    percentage[i], // Displays percentage
                    grade[i]);     // Displays grade
        }

        input.close(); // Closing Scanner to release system resources
    }
}
