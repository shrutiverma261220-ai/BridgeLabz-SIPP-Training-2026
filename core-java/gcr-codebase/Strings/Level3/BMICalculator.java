import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double w, h, bmi;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter weight and height (cm) for person " + i + ": ");
            w = sc.nextDouble();
            h = sc.nextDouble() / 100;

            bmi = w / (h * h);

            System.out.print("BMI: " + bmi + " Status: ");

            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25)
                System.out.println("Normal");
            else if (bmi < 40)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
        }

        sc.close();
    }
}