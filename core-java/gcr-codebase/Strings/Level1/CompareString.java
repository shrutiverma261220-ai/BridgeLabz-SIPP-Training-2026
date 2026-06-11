import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        boolean same = a.length() == b.length();

        for (int i = 0; same && i < a.length(); i++) {
            same = a.charAt(i) == b.charAt(i);
        }

        System.out.println("charAt(): " + same);
        System.out.println("equals(): " + a.equals(b));

        sc.close();
    }
}