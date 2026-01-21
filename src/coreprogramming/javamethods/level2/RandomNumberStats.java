/*
 This program generates an array of random 4-digit numbers and
 calculates basic statistics such as average, minimum, and maximum.
 It demonstrates the use of methods, arrays, loops, and Math utilities.
*/
package CoreProgramming.javamethods.level2;
// Package declaration for JavaMethods Level 2 programs

public class RandomNumberStats {
    // Class to generate random numbers and compute statistics

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];
        // Creating an array to store random numbers

        for (int i = 0; i < size; i++) {
            // Loop to fill the array with random numbers

            numbers[i] = (int) (Math.random() * 9000) + 1000;
            // Generating a random 4-digit number between 1000 and 9999
        }

        return numbers;
        // Returning the generated array
    }

    // Method to find average, minimum, and maximum of an integer array
    public static double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        // Variable to store sum of all numbers

        int min = numbers[0];
        // Initializing minimum with first element

        int max = numbers[0];
        // Initializing maximum with first element

        for (int num : numbers) {
            // Looping through each element in the array

            sum += num;
            // Adding current number to sum

            min = Math.min(min, num);
            // Updating minimum value if smaller number is found

            max = Math.max(max, num);
            // Updating maximum value if larger number is found
        }

        double average = (double) sum / numbers.length;
        // Calculating average of the numbers

        return new double[]{average, min, max};
        // Returning average, minimum, and maximum as an array
    }

    public static void main(String[] args) {

        int[] randomNumbers = generate4DigitRandomArray(5);
        // Generating an array of 5 random 4-digit numbers

        System.out.println("Generated 4-digit random numbers:");
        // Printing heading message

        for (int num : randomNumbers) {
            // Loop to print each random number

            System.out.print(num + " ");
            // Printing the number
        }

        double[] result = findAverageMinMax(randomNumbers);
        // Calling method to find average, min, and max

        System.out.println("\n\nAverage: " + result[0]);
        // Printing the average value

        System.out.println("Minimum: " + result[1]);
        // Printing the minimum value

        System.out.println("Maximum: " + result[2]);
        // Printing the maximum value
    }
}
