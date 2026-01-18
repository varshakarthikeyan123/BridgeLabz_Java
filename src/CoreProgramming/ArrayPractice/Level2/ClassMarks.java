/*
 This program manages and processes class marks for multiple students.
 It takes Physics, Chemistry, and Maths marks for each student,
 validates the input, calculates total percentage,
 assigns grades based on percentage, and finally
 displays the results in a tabular format.
*/
package CoreProgramming.ArrayPractice.Level2; // Defines the package for Level 2 array practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class ClassMarks { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        System.out.print("Enter number of students: "); // Prompting user for number of students
        int students = input.nextInt(); // Reading the number of students

        int[] physics = new int[students]; // Array to store Physics marks
        int[] chemistry = new int[students]; // Array to store Chemistry marks
        int[] maths = new int[students]; // Array to store Maths marks

        double[] percentage = new double[students]; // Array to store percentage of each student
        char[] grade = new char[students]; // Array to store grade of each student

        // Loop to take marks input for each student
        for (int i = 0; i < students; i++) { // Iterates through each student

            System.out.println("\nEnter marks for Student " + (i + 1)); // Displays student number

            System.out.print("Physics: "); // Prompt for Physics marks
            physics[i] = input.nextInt(); // Reads Physics marks

            System.out.print("Chemistry: "); // Prompt for Chemistry marks
            chemistry[i] = input.nextInt(); // Reads Chemistry marks

            System.out.print("Maths: "); // Prompt for Maths marks
            maths[i] = input.nextInt(); // Reads Maths marks

            // Validation to ensure marks are not negative
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) { // Checks for invalid marks
                System.out.println("Invalid marks! Enter positive values only."); // Error message
                i--; // Repeats input for the same student
            }
        }

        // Loop to calculate percentage and assign grades
        for (int i = 0; i < students; i++) { // Iterates through each student

            int total = physics[i] + chemistry[i] + maths[i]; // Calculates total marks

            percentage[i] = (total / 300.0) * 100; // Calculates percentage out of 300

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

        // Displaying marks, percentage, and grade in tabular format
        for (int i = 0; i < students; i++) { // Iterates through each student
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n",
                    physics[i], // Displays Physics marks
                    chemistry[i], // Displays Chemistry marks
                    maths[i], // Displays Maths marks
                    percentage[i], // Displays percentage
                    grade[i]); // Displays grade
        }

        input.close(); // Closing Scanner to free system resources
    }
}
