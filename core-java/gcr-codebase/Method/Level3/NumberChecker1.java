import java.util.Scanner;

public class NumberChecker1 {

    
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    
    static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    
    static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

   
    static boolean isArmstrong(int n, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int d : digits)
            sum += (int) Math.pow(d, power);

        return sum == n;
    }

   
    static void largestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + second);
    }

    static void smallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }

        System.out.println("Smallest Digit = " + smallest);
        System.out.println("Second Smallest Digit = " + second);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        System.out.print("Digits : ");
        for (int d : digits)
            System.out.print(d + " ");

        System.out.println("\nDigit Count = " + countDigits(num));
        System.out.println("Duck Number = " + isDuck(digits));
        System.out.println("Armstrong Number = " + isArmstrong(num, digits));

        largestSecondLargest(digits);
        smallestSecondSmallest(digits);

        sc.close();
    }
}