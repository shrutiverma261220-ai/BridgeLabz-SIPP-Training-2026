import java.util.*;

public class Frequency {

    static String[][] freq(String str) {
        int[] f = new int[256];

        for (int i = 0; i < str.length(); i++)
            f[str.charAt(i)]++;

        String[][] res = new String[str.length()][2];
        int k = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (f[ch] != 0) {
                res[k][0] = ch + "";
                res[k][1] = f[ch] + "";
                f[ch] = 0;
                k++;
            }
        }

        return Arrays.copyOf(res, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[][] ans = freq(str);

        for (String[] r : ans)
            System.out.println(r[0] + " -> " + r[1]);

        sc.close();
    }
}