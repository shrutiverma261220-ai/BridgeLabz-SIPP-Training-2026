import java.util.*;

public class NaturalNumber {

    static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int r1 = sum(n);
        int r2 = n * (n + 1) / 2;

        System.out.println("Recursion = " + r1);
        System.out.println("Formula = " + r2);

        if (r1 == r2)
            System.out.println("Correct");
    }
}