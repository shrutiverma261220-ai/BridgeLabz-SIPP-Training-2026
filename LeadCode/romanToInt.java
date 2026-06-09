public class romanToInt {

    public static int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'I') total += 1;
            else if (ch == 'V') total += 5;
            else if (ch == 'X') total += 10;
            else if (ch == 'L') total += 50;
            else if (ch == 'C') total += 100;
            else if (ch == 'D') total += 500;
            else if (ch == 'M') total += 1000;
        }

        if (s.contains("IV")) total -= 2;
        if (s.contains("IX")) total -= 2;
        if (s.contains("XL")) total -= 20;
        if (s.contains("XC")) total -= 20;
        if (s.contains("CD")) total -= 200;
        if (s.contains("CM")) total -= 200;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}