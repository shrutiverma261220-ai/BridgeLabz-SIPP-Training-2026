import java.util.*;

public class FrequencyUnique {

   
    static char[] uniqueChars(String str) {
        char[] temp = new char[str.length()];
        int k = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) temp[k++] = ch;
        }

        return Arrays.copyOf(temp, k);
    }

   
    static String[][] frequency(String str) {

        char[] unique = uniqueChars(str);
        String[][] res = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (unique[i] == str.charAt(j))
                    count++;
            }

            res[i][0] = unique[i] + "";
            res[i][1] = count + "";
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[][] result = frequency(str);

        for (String[] r : result)
            System.out.println(r[0] + " -> " + r[1]);

        sc.close();
    }
}