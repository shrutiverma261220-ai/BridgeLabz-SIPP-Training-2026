import java.util.Scanner;

public class ShortLong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] w = s.split(" ");

        String min = w[0], max = w[0];

        for (int i = 1; i < w.length; i++) {
            if (w[i].length() < min.length()) min = w[i];
            if (w[i].length() > max.length()) max = w[i];
        }

        System.out.println("Shortest: " + min);
        System.out.println("Longest: " + max);

        sc.close();
    }
}