import java.util.Scanner;

public class LineEquation {

   
    static double distance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) +
                         Math.pow(y2 - y1, 2));
    }

    
    static double[] line(double x1, double y1, double x2, double y2) {

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 : ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1 : ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 : ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2 : ");
        double y2 = sc.nextDouble();

        double d = distance(x1, y1, x2, y2);
        double[] ans = line(x1, y1, x2, y2);

        System.out.printf("\nDistance = %.2f\n", d);
        System.out.printf("Slope = %.2f\n", ans[0]);
        System.out.printf("Y-Intercept = %.2f\n", ans[1]);
        System.out.printf("Equation : y = %.2fx + %.2f\n", ans[0], ans[1]);

        sc.close();
    }
}