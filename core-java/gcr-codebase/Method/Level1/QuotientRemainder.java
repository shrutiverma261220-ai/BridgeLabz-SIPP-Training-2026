import java.util.Scanner;

public class QuotientRemainder {

    static void calculate(int n, int d) {

        System.out.println("Quotient = " + (n / d));
        System.out.println("Remainder = " + (n % d));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();

        System.out.print("Divisor: ");
        int d = sc.nextInt();

        calculate(n, d);
    }
}