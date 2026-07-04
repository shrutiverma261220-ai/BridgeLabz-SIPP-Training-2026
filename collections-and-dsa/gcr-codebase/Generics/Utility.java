import java.util.List;

public class Utility {

    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T item : arr) {

            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    public static void printList(List<?> list) {

        for (Object item : list) {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}