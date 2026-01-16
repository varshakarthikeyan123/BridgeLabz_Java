package CoreProgramming.JavaMethods.Level3;

public class OTP {

    public static int otpNumber() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        do {
            for (int i = 0; i < otps.length; i++) {
                otps[i] = otpNumber();
            }
        } while (!areUnique(otps));

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        System.out.println("All OTPs are unique.");
    }
}
