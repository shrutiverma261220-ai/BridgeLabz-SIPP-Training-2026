import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0;

        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(i);
        }

        System.out.println(s.length());

        sc.close();
    }
}