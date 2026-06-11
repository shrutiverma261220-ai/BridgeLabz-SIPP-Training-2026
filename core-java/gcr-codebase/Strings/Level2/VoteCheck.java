import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] res = new int[10][2]; // 0 = age, 1 = vote(0/1)

        for (int i = 0; i < 10; i++) {
            int age = sc.nextInt();
            res[i][0] = age;
            res[i][1] = (age >= 18) ? 1 : 0;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(res[i][0] + " -> " + (res[i][1] == 1 ? "Can Vote" : "Cannot Vote"));
        }

        sc.close();
    }
}