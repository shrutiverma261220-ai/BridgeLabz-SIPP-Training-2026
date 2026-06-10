import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salary = sc.nextFloat();
        int years = sc.nextInt();

        if (years > 5)
            System.out.println((salary * 5) / 100);
        else
            System.out.println(0);
    }
}