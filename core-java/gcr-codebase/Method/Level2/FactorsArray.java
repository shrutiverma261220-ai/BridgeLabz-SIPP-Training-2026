import java.util.*;

public class FactorsArray {

    static int[] factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                list.add(i);

        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            a[i] = list.get(i);

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] f = factors(n);

        int sum = 0, product = 1, squareSum = 0;

        for (int x : f) {
            System.out.print(x + " ");
            sum += x;
            product *= x;
            squareSum += x * x;
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Square Sum = " + squareSum);
    }
}