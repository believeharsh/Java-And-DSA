package Practice;

import java.util.Arrays;

public class SelectionSortPrc {
    public static void main(String[] args) {
        int[] arr = { 0, 5, 4, 2, 9, 7, 8, 10 };
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }

    static int[] SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[minInd]) {
                    minInd = j;
                }
            }
            if (i != minInd) {
                swap(arr, i, minInd);
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int minInd) {
        int temp = arr[i];
        arr[i] = arr[minInd];
        arr[minInd] = temp;
    }
}
