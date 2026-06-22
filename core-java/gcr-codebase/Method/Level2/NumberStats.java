public class NumberStats {

    public static void main(String[] args) {

        int[] a = new int[5];
        int sum = 0, min = 9999, max = 1000;

        for (int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 9000) + 1000;
            System.out.print(a[i] + " ");

            sum += a[i];
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }

        System.out.println("\nAverage = " + (sum / 5.0));
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}