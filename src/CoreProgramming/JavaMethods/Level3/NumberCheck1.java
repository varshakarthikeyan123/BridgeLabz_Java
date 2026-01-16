package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;

public class NumberCheck1 {

    // Method to count the number of digits in a given number
    public static int digitCount(int number) {
        int count = 0;
        // Loop runs until number becomes 0, counting each digit
        while (number > 0) {
            count++;
            number /= 10; // Remove last digit
        }
        return count;
    }

    // Method to store digits of a number into an array
    public static int[] digitArray(int count, int number) {
        int[] digit = new int[count];
        // Fill the array from last index to first to maintain original order
        for (int i = count - 1; i >= 0; i--) {
            digit[i] = number % 10; // Extract last digit
            number /= 10;           // Remove last digit
        }
        return digit;
    }

    // Method to check whether the number is a Duck Number
    // A Duck number contains at least one zero in its digits
    public static boolean duckNUmber(int[] digit) {
        for (int i = 0; i < digit.length; i++) {
            if (digit[i] == 0) {
                return true; // Zero found
            }
        }
        return false; // No zero found
    }

    // Method to check whether the number is an Armstrong number
    public static boolean armstrongNumber(int[] digit, int number) {
        int sum = 0;
        int power = digit.length; // Power equals number of digits

        // Raise each digit to the power and add to sum
        for (int d : digit) {
            sum += (int) Math.pow(d, power);
        }

        // Armstrong number if sum equals original number
        return sum == number;
    }

    // Method to find the largest and second largest digit
    public static int[] largestElement(int[] digit) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse digits to find largest and second largest
        for (int d : digit) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digit
    public static int[] smallestElement(int[] digit) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse digits to find smallest and second smallest
        for (int d : digit) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d > smallest && d < secondSmallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        // Count digits in the number
        int count = digitCount(number);

        // Convert number into digit array
        int[] digits = digitArray(count, number);

        // Check and display Duck Number result
        System.out.println("Duck Number: " + duckNUmber(digits));

        // Check and display Armstrong Number result
        System.out.println("Armstrong Number: " + armstrongNumber(digits, number));

        // Find and display largest and second largest digit
        int[] max = largestElement(digits);
        System.out.println("Largest: " + max[0] + ", Second Largest: " + max[1]);

        // Find and display smallest and second smallest digit
        int[] min = smallestElement(digits);
        System.out.println("Smallest: " + min[0] + ", Second Smallest: " + min[1]);
    }
}
