import java.util.*;

public class LeapYearChecker {

    static boolean leap(int y) {
        return y >= 1582 &&
                ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if (leap(y))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}