import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] a = new String[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.next();
        }

        try {
            System.out.println(a[5]); // wrong index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }

        sc.close();
    }
}