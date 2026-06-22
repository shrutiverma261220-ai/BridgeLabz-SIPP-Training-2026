import java.util.*;

public class StudentVote {

    static boolean canStudentVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();

            if (canStudentVote(age[i]))
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
    }
}