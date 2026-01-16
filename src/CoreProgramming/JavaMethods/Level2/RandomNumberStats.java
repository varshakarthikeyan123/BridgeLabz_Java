package CoreProgramming.JavaMethods.Level2;

public class RandomNumberStats {

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {

        // Create an array to store random numbers
        int[] numbers = new int[size];

        // Loop to generate each random 4-digit number
        for (int i = 0; i < size; i++) {
            // Math.random() generates a value between 0.0 and 1.0
            // Multiplying by 9000 gives range 0–8999, adding 1000 makes it 1000–9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        // Return the filled array
        return numbers;
    }

    // Method to find average, minimum, and maximum of an integer array
    public static double[] findAverageMinMax(int[] numbers) {

        // Initialize sum to calculate average
        int sum = 0;

        // Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;                 // Add each number to sum
            min = Math.min(min, num);   // Update minimum value
            max = Math.max(max, num);   // Update maximum value
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Return average, min, and max as a double array
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Print generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        // Find average, minimum, and maximum values
        double[] result = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("\n\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
