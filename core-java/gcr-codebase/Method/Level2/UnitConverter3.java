import java.util.*;

public class UnitConverter3 {

    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    static double poundToKg(double p) {
        return p * 0.453592;
    }

    static double kgToPound(double k) {
        return k * 2.20462;
    }

    static double gallonToLiter(double g) {
        return g * 3.78541;
    }

    static double literToGallon(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        System.out.println(fToC(x));
        System.out.println(cToF(x));
        System.out.println(poundToKg(x));
        System.out.println(kgToPound(x));
        System.out.println(gallonToLiter(x));
        System.out.println(literToGallon(x));
    }
}