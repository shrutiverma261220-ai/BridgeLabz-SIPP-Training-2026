import java.util.*;

public class UniqueCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int len = 0;

     
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        char[] result = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                result[k++] = ch;
            }
        }

        System.out.print("Unique characters: ");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}