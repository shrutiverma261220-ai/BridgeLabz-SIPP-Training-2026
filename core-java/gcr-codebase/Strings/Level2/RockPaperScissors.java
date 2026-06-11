import java.util.Scanner;

public class RockPaperScissors {

    static String compChoice() {
        int r = (int)(Math.random() * 3);
        return (r == 0) ? "rock" : (r == 1) ? "paper" : "scissors";
    }

    static String winner(String u, String c) {
        if (u.equals(c)) return "Draw";
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int uWin = 0, cWin = 0;

        System.out.println("User\tComputer\tWinner");

        for (int i = 0; i < n; i++) {
            String u = sc.next();
            String c = compChoice();
            String w = winner(u, c);

            if (w.equals("User")) uWin++;
            else if (w.equals("Computer")) cWin++;

            System.out.println(u + "\t" + c + "\t\t" + w);
        }

        System.out.println("\nUser Win%: " + (uWin * 100 / n));
        System.out.println("Computer Win%: " + (cWin * 100 / n));

        sc.close();
    }
}