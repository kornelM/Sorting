package mycompany;

public class SelectSort {


    public static void sort(int[] arrayToSort) {
        int n = arrayToSort.length;
        int minIndex;

        for (int i = 0; i < n - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arrayToSort[j] < arrayToSort[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arrayToSort, minIndex, i);
            }
        }

    }

    private static void swap(int[] array, int border, int i) {
        int temp = array[border];
        array[border] = array[i];
        array[i] = temp;
    }


}
