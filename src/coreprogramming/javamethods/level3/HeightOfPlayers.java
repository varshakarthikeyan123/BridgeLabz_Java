/*
 This program simulates the heights of 11 players.
 It generates random heights between 150 cm and 250 cm,
 stores them in an array, and then calculates:
 1) The shortest height
 2) The tallest height
 3) The mean (average) height
 The program demonstrates the use of arrays, methods,
 loops, and basic statistical calculations.
*/
package coreprogramming.javamethods.level3;

public class HeightOfPlayers {

    // Method to generate a random height between 150 cm and 250 cm
    public int generateHeight() {

        // Math.random() generates a value between 0.0 and 1.0
        // Scaling and shifting it to get values between 150 and 250
        return (int) (Math.random() * (250 - 150 + 1)) + 150;
    }

    // Method to calculate the sum of all heights
    public int findSum(int[] heights) {

        int sum = 0;
        // Variable to store total sum of heights

        // Loop through each height and add it to sum
        for (int h : heights) {
            sum += h;
        }

        // Returning the total sum of heights
        return sum;
    }

    // Method to calculate the mean (average) height
    public double findMean(int[] heights) {

        // Calculating mean by dividing sum by number of players
        return (double) findSum(heights) / heights.length;
    }

    // Method to find the shortest height
    public int findShortest(int[] heights) {

        int min = heights[0];
        // Assuming the first height is the shortest initially

        // Loop to compare each height and find the minimum
        for (int h : heights) {
            min = Math.min(min, h);
        }

        // Returning the shortest height
        return min;
    }

    // Method to find the tallest height
    public int findTallest(int[] heights) {

        int max = heights[0];
        // Assuming the first height is the tallest initially

        // Loop to compare each height and find the maximum
        for (int h : heights) {
            max = Math.max(max, h);
        }

        // Returning the tallest height
        return max;
    }

    public static void main(String[] args) {

        HeightOfPlayers obj = new HeightOfPlayers();
        // Creating object to access non-static methods

        int[] heights = new int[11];
        // Array to store heights of 11 players

        System.out.println("Heights of players:");
        // Display message before printing heights

        // Loop to generate and store random heights
        for (int i = 0; i < heights.length; i++) {

            heights[i] = obj.generateHeight();
            // Generating random height for each player

            System.out.print(heights[i] + " ");
            // Printing each generated height
        }

        System.out.println("\n\nShortest height: " + obj.findShortest(heights));
        // Printing the shortest height

        System.out.println("Tallest height: " + obj.findTallest(heights));
        // Printing the tallest height

        System.out.println("Mean height: " + obj.findMean(heights));
        // Printing the mean height
    }
}
