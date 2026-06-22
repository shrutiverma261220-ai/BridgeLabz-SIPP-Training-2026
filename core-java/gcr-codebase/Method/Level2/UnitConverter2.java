import java.util.*;

public class UnitConverter2 {

    static double yardToFeet(double y) {
        return y * 3;
    }

    static double feetToYard(double f) {
        return f * 0.333333;
    }

    static double meterToInch(double m) {
        return m * 39.3701;
    }

    static double inchToMeter(double i) {
        return i * 0.0254;
    }

    static double inchToCm(double i) {
        return i * 2.54;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        System.out.println(yardToFeet(x));
        System.out.println(feetToYard(x));
        System.out.println(meterToInch(x));
        System.out.println(inchToMeter(x));
        System.out.println(inchToCm(x));
    }
}