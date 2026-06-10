import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("Loop sum = " + sum);
        System.out.println("Formula sum = " + formula);

        if (sum == formula)
            System.out.println("Correct");
        else
            System.out.println("Wrong");
    }
}