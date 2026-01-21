/*
 This program generates 10 unique 6-digit OTP numbers.
 It keeps regenerating OTPs until all of them are unique.
*/
package CoreProgramming.javamethods.level3;

public class OTP {

    // Method to generate a 6-digit OTP number
    public static int otpNumber() {
        // Math.random() generates value between 0.0 and 1.0
        // Scaling it to generate a number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs in the array are unique
    public static boolean areUnique(int[] otpArray) {

        // Compare each OTP with every other OTP
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                // If any two OTPs are same, return false
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
        // All OTPs are unique
    }

    public static void main(String[] args) {

        // Array to store 10 OTP numbers
        int[] otps = new int[10];

        // Generate OTPs repeatedly until all are unique
        do {
            for (int i = 0; i < otps.length; i++) {
                otps[i] = otpNumber();
                // Generating a random OTP for each index
            }
        } while (!areUnique(otps));

        // Printing all generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Confirmation message
        System.out.println("All OTPs are unique.");
    }
}
