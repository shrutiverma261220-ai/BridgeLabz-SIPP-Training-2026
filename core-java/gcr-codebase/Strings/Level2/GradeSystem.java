import java.util.*;

public class GradeSystem {
    public static void main(String[] args) {
        int p, c, m;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics, Chemistry, Math marks: ");
        p = sc.nextInt();
        c = sc.nextInt();
        m = sc.nextInt();

        double per = (p + c + m) / 3.0;

        System.out.println("Percentage: " + per);

        if (per >= 80) System.out.println("Grade A");
        else if (per >= 70) System.out.println("Grade B");
        else if (per >= 60) System.out.println("Grade C");
        else if (per >= 50) System.out.println("Grade D");
        else if (per >= 40) System.out.println("Grade E");
        else System.out.println("Grade R");
    }
}