import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char)(c - 32);
            r += c;
        }

        System.out.println(r.equals(s.toUpperCase()));

        sc.close();
    }
}