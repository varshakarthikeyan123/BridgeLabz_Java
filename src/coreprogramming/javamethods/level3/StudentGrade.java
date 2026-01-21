/*
 This program generates random marks for students,
 calculates total, average, and percentage,
 and displays a formatted scorecard.
*/
package CoreProgramming.javamethods.level3;

import java.util.Random;

public class StudentGrade {

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        // scores[i][0] -> Physics, scores[i][1] -> Chemistry, scores[i][2] -> Math

        for (int i = 0; i < numStudents; i++) {
            // Generating random marks between 50 and 100 for each subject
            scores[i][0] = rand.nextInt(51) + 50;
            scores[i][1] = rand.nextInt(51) + 50;
            scores[i][2] = rand.nextInt(51) + 50;
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        // results[i][0] -> Total, results[i][1] -> Average, results[i][2] -> Percentage

        for (int i = 0; i < numStudents; i++) {

            // Calculating total marks
            int total = scores[i][0] + scores[i][1] + scores[i][2];

            // Calculating average
            double average = total / 3.0;

            // Calculating percentage out of 300
            double percentage = (total / 300.0) * 100;

            // Rounding values to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            // Storing results
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to display student marks and results
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

        int numStudents = 5; // Total number of students

        // Generate student scores
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateTotalAveragePercentage(scores);

        // Display the final scorecard
        displayScorecard(scores, results);
    }
}
