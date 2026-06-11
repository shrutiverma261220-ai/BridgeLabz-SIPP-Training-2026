import java.util.Scanner;

public class Length2D {

    static String[] splitWords(String s) {
        int c = 1;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ') c++;

        String[] a = new String[c];
        int start = 0, k = 0;

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                a[k++] = s.substring(start, i);
                start = i + 1;
            }
        }
        return a;
    }

    static int len(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    static String[][] build(String[] w) {
        String[][] r = new String[w.length][2];

        for (int i = 0; i < w.length; i++) {
            r[i][0] = w[i];
            r[i][1] = String.valueOf(len(w[i]));
        }

        return r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] res = build(splitWords(s));

        for (String[] x : res) {
            System.out.println(x[0] + " " + x[1]);
        }

        sc.close();
    }
}