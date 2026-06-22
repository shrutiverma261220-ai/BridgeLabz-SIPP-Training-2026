import java.util.Scanner;

public class Trigonometry {

    static void calculate(double angle) {

        double rad = Math.toRadians(angle);

        System.out.println("Sin = " + Math.sin(rad));
        System.out.println("Cos = " + Math.cos(rad));
        System.out.println("Tan = " + Math.tan(rad));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Angle: ");
        double angle = sc.nextDouble();

        calculate(angle);
    }
}