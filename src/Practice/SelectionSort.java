package Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        selectionSortAlgoAscn(arr1);
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        selectionSortAlgoDesc(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    // this is for ascending order sorting 
    static void selectionSortAlgoAscn(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    // this is for the descending order sorting 
    static void selectionSortAlgoDesc(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }

            // Swap
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }


}
