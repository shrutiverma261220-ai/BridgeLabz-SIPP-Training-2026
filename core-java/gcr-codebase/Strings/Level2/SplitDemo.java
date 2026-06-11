import java.util.Scanner;

public class SplitDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] a = s.split(" ");
        String[] b = new String[a.length];

        int k = 0, start = 0;

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                b[k++] = s.substring(start, i);
                start = i + 1;
            }
        }

        System.out.println(java.util.Arrays.equals(a, b));

        sc.close();
    }
}