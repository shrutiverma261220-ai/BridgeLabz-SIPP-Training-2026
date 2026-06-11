import java.util.Scanner;

public class ConsonantType {

    static String type(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] process(String s) {
        String[][] res = new String[s.length()][2];

        for (int i = 0; i < s.length(); i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = type(s.charAt(i));
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] r = process(s);

        for (String[] x : r) {
            System.out.println(x[0] + " -> " + x[1]);
        }

        sc.close();
    }
}