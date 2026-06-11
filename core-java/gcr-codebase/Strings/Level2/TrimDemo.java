import java.util.Scanner;

public class TrimDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int st = 0, en = s.length() - 1;

        while (st <= en && s.charAt(st) == ' ') st++;
        while (en >= st && s.charAt(en) == ' ') en--;

        String r = "";
        for (int i = st; i <= en; i++) {
            r += s.charAt(i);
        }

        System.out.println(r.equals(s.trim()));

        sc.close();
    }
}