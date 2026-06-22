import java.util.Scanner;

public class Chocolate {

    static void divide(int c, int n) {

        System.out.println("Each Child Gets = " + (c / n));
        System.out.println("Remaining = " + (c % n));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Chocolates: ");
        int c = sc.nextInt();

        System.out.print("Children: ");
        int n = sc.nextInt();

        divide(c, n);
    }
}