import java.util.*;

public class UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double m) {
        return m * 1.60934;
    }

    static double meterToFeet(double m) {
        return m * 3.28084;
    }

    static double feetToMeter(double f) {
        return f * 0.3048;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        System.out.println(kmToMiles(x));
        System.out.println(milesToKm(x));
        System.out.println(meterToFeet(x));
        System.out.println(feetToMeter(x));
    }
}