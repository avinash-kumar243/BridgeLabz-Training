// Writing a program to generate a six-digit OTP number
public class OTPGeneration {
    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs are unique or not
    public static boolean areOTPsUnique(int[] otps) {
        for(int i = 0; i < otps.length; i++) {
            for(int j = i+1; j < otps.length; j++) {
                if(otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generating OTPs 10 times and store in array
        for(int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Displaying generated OTPs
        System.out.println("Generated OTPs:");
        for(int otp : otpArray) {
            System.out.println(otp);
        }

        // Validation of uniqueness
        if(areOTPsUnique(otpArray)) {
            System.out.println("\n All OTPs are unique");
        } else {
            System.out.println("\n Duplicate OTPs found");
        }
    }
}
