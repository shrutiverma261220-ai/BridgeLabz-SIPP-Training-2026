import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int st = sc.nextInt();
        int en = sc.nextInt();

        String r = "";

        for (int i = st; i < en; i++) {
            r += s.charAt(i);
        }

        String b = s.substring(st, en);

        System.out.println(r);
        System.out.println(b);
        System.out.println(r.equals(b));

        sc.close();
    }
}