import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double areaCm = b * h / 2;
        double areaIn = areaCm / 6.4516;

        System.out.println("Area in sq cm = " + areaCm);
        System.out.println("Area in sq in = " + areaIn);
    }
}