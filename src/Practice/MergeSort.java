package Practice;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 5, 7, 0, 90 };
        sortMerge(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sortMerge(int[] arr, int start, int end) {
        // if (start < end) {
        // int mid = start + (end - start) / 2;
        // sortMerge(arr, start, mid);
        // sortMerge(arr, mid + 1, end);
        // merge(arr, start, mid, end);

        // }
        if (start >= end) {
            return;

        }
        int mid = start + (end - start) / 2;
        sortMerge(arr, start, mid);
        sortMerge(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] >= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
