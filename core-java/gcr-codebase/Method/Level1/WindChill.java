import java.util.Scanner;

public class WindChill {

    static double chill(double t, double v) {

        return 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16)
                + 0.4275 * t * Math.pow(v, 0.16);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Temperature: ");
        double t = sc.nextDouble();

        System.out.print("Wind Speed: ");
        double v = sc.nextDouble();

        System.out.println("Wind Chill = " + chill(t, v));
    }
}