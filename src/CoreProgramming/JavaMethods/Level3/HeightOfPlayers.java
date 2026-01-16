package CoreProgramming.JavaMethods.Level3;

public class HeightOfPlayers {

    // Method to generate a random height between 150 cm and 250 cm (inclusive)
    public int generateHeight() {
        // Math.random() gives value between 0.0 and 1.0
        // Formula scales it to the range 150–250
        return (int) (Math.random() * (250 - 150 + 1)) + 150;
    }

    // Method to calculate the sum of all heights
    public int findSum(int[] heights) {
        int sum = 0;
        // Loop through each height and add it to sum
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate the mean (average) height
    public double findMean(int[] heights) {
        // Mean = sum of heights divided by number of players
        return (double) findSum(heights) / heights.length;
    }

    // Method to find the shortest height in the array
    public int findShortest(int[] heights) {
        // Assume first height is the shortest initially
        int min = heights[0];
        // Compare each height to find the minimum
        for (int h : heights) {
            min = Math.min(min, h);
        }
        return min;
    }

    // Method to find the tallest height in the array
    public int findTallest(int[] heights) {
        // Assume first height is the tallest initially
        int max = heights[0];
        // Compare each height to find the maximum
        for (int h : heights) {
            max = Math.max(max, h);
        }
        return max;
    }

    public static void main(String[] args) {

        // Create object to access non-static methods
        HeightOfPlayers obj = new HeightOfPlayers();

        // Array to store heights of 11 players
        int[] heights = new int[11];

        System.out.println("Heights of players:");

        // Generate and store random heights for each player
        for (int i = 0; i < heights.length; i++) {
            heights[i] = obj.generateHeight();
            System.out.print(heights[i] + " ");
        }

        // Display shortest, tallest, and mean height
        System.out.println("\n\nShortest height: " + obj.findShortest(heights));
        System.out.println("Tallest height: " + obj.findTallest(heights));
        System.out.println("Mean height: " + obj.findMean(heights));
    }
}
