package mycompany;

public class InsertionSort {


    public static void sort(int[] arrayToSort) {
        int n = arrayToSort.length;
        int current;

        int otherIndex;


        for (int i = 1; i < n; i++) {
            current = arrayToSort[i];
            otherIndex = i;

            while (otherIndex > 0 && current < arrayToSort[otherIndex - 1]) {
                arrayToSort[otherIndex] = arrayToSort[otherIndex - 1];
                otherIndex--;
            }
            arrayToSort[otherIndex] = current;
        }

    }

    private static void swap(int[] array, int border, int i) {
        int temp = array[border];
        array[border] = array[i];
        array[i] = temp;
    }


}
