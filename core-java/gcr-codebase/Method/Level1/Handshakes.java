import java.util.Scanner;

public class Handshakes {

    static int total(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Students: ");
        int n = sc.nextInt();

        System.out.println("Handshakes = " + total(n));
    }
}