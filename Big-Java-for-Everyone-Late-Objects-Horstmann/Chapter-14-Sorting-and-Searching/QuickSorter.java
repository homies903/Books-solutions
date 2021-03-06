package chapter14;

public class QuickSorter {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int from, int to) {
        if (from >= to) {
            return;
        }
        int p = partition(array, from, to);
        sort(array, from, p);
        sort(array, p + 1, to);
    }

    private static int partition(int[] array, int from, int to) {
        int pivot = array[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j) {
            i++;
            while (array[i] < pivot) {
                i++;
            }
            j--;
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return j;
    }
}
