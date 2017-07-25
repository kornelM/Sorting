package mycompany;

public class QuickSort {

    public static void sort(int[] arrayToSort) {
        if (arrayToSort == null || arrayToSort.length == 0) {
            return;
        }
        int n = arrayToSort.length;
        quickSort(arrayToSort, 0, n - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int border = partitionArray(array, left, right);

        if (border - left < right - border) {
            quickSort(array, left, border - 1);
            quickSort(array, border + 1, right);
        }else{
            quickSort(array, border + 1, right);
            quickSort(array, left, border - 1);
        }

    }

    private static int partitionArray(int[] array, int left, int right) {
        int pivotValue = choosePivot(array, left, right);
        int border = left - 1; //przed pierszym elementem
        int i = left;

        while (i < right) {
            if (array[i] < pivotValue) {
                border++;
                if (border != i) {
                    swap(array, border, i);
                }
            }
            i++;
        }
        border++;
        if (border != i) {
            swap(array, border, i);
        }
        return border;
    }

    private static int choosePivot(int[] array, int left, int right) {
        int mid = (left + right) / 2;
        int pivotValue = array[mid];
        swap(array, mid, right);

        return pivotValue;
    }

    private static void swap(int[] array, int border, int i) {
        int temp = array[border];
        array[border] = array[i];
        array[i] = temp;
    }

}
