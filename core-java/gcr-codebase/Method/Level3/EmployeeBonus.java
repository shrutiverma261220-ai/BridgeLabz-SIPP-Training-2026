public class EmployeeBonus {

    
    static int[][] employeeData() {
        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // Salary
            data[i][1] = (int) (Math.random() * 10) + 1;        // Years
        }

        return data;
    }

    
    static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[10][2];

        for (int i = 0; i < 10; i++) {

            double bonus;

            if (data[i][1] > 5)
                bonus = data[i][0] * 0.05;
            else
                bonus = data[i][0] * 0.02;

            result[i][0] = bonus;
            result[i][1] = data[i][0] + bonus;
        }

        return result;
    }

    
    static void display(int[][] data, double[][] result) {

        double totalOld = 0;
        double totalBonus = 0;
        double totalNew = 0;

        System.out.println("---------------------------------------------------------------");
        System.out.println("Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%d\t%d\t%.2f\t%.2f\n",
                    data[i][0], data[i][1], result[i][0], result[i][1]);

            totalOld += data[i][0];
            totalBonus += result[i][0];
            totalNew += result[i][1];
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total Old Salary : %.2f\n", totalOld);
        System.out.printf("Total Bonus      : %.2f\n", totalBonus);
        System.out.printf("Total New Salary : %.2f\n", totalNew);
    }

    public static void main(String[] args) {

        int[][] data = employeeData();
        double[][] result = calculateBonus(data);

        display(data, result);
    }
}