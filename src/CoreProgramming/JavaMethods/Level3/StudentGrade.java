package CoreProgramming.JavaMethods.Level3;

import java.util.Random;

public class StudentGrade {

    // Generates random marks for each student in Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        // [][0] = Physics, [][1] = Chemistry, [][2] = Math

        for (int i = 0; i < numStudents; i++) {
            // Random marks between 50 and 100
            scores[i][0] = rand.nextInt(51) + 50;
            scores[i][1] = rand.nextInt(51) + 50;
            scores[i][2] = rand.nextInt(51) + 50;
        }
        return scores;
    }

    // Calculates total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        // [][0] = Total, [][1] = Average, [][2] = Percentage

        for (int i = 0; i < numStudents; i++) {
            // Sum of all three subject marks
            int total = scores[i][0] + scores[i][1] + scores[i][2];

            // Average marks
            double average = total / 3.0;

            // Percentage calculation out of 300
            double percentage = (total / 300.0) * 100;

            // Rounding average and percentage to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            // Storing computed values
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Displays marks along with total, average, and percentage
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "%");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students

        // Generate marks for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateTotalAveragePercentage(scores);

        // Display final scorecard
        displayScorecard(scores, results);
    }
}
