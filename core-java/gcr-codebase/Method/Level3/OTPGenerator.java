public class OTPGenerator {

    
    static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    
    static boolean isUnique(int[] otp) {

        for (int i = 0; i < otp.length; i++) {
            for (int j = i + 1; j < otp.length; j++) {
                if (otp[i] == otp[j])
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otp = new int[10];

        System.out.println("Generated OTPs:");

        for (int i = 0; i < otp.length; i++) {
            otp[i] = generateOTP();
            System.out.println((i + 1) + ". " + otp[i]);
        }

        if (isUnique(otp))
            System.out.println("\nAll OTPs are Unique.");
        else
            System.out.println("\nDuplicate OTP Found.");
    }
}