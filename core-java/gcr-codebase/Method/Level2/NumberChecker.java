import java.util.*;

public class NumberChecker {

    static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();

            if (a[i] >= 0) {
                if (a[i] % 2 == 0)
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int c = compare(a[0], a[4]);

        if (c == 1)
            System.out.println("First Greater");
        else if (c == 0)
            System.out.println("Equal");
        else
            System.out.println("Last Greater");
    }
}