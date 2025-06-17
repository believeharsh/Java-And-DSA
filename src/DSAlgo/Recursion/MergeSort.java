package DSAlgo.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // int[] arr = { 4, 5, 1, 3, 2 };
        // int[] ans = mergeSort(arr);
        // System.out.println(Arrays.toString(ans));

        System.out.println("Let's implement the MergeSort Algo");
        int[] arr = { 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // My main approach

    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];
        int k = 0;
        int i = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[start] < arr[j]) {
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

        for (int x = 0; x < mix.length; x++) {
            arr[start + x] = mix[x];
        }
    }

    // static int[] mergeSort(int[] arr) {
    // if (arr.length == 1) {
    // return arr;
    // }

    // int mid = arr.length / 2;

    // int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    // int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    // return merge(left, right);
    // }

    // private static int[] merge(int[] first, int[] second) {
    // int[] mix = new int[first.length + second.length];

    // int i = 0;
    // int j = 0;
    // int k = 0;

    // while (i < first.length && j < second.length) {
    // if (first[i] < second[j]) {
    // mix[k] = first[i];
    // i++;
    // } else {
    // mix[k] = second[j];
    // j++;
    // }
    // k++;
    // }

    // // it may be possible that one of the arrays is not complete
    // // copy the remaining elements
    // while (i < first.length) {
    // mix[k] = first[i];
    // i++;
    // k++;
    // }

    // while (j < second.length) {
    // mix[k] = second[j];
    // j++;
    // k++;
    // }

    // return mix;
    // }

    // static void mergeSortInPlace(int[] arr, int s, int e) {
    // if (e - s == 1) {
    // return;
    // }

    // int mid = (s + e) / 2;

    // mergeSortInPlace(arr, s, mid);
    // mergeSortInPlace(arr, mid, e);

    // mergeInPlace(arr, s, mid, e);
    // }

    // private static void mergeInPlace(int[] arr, int s, int m, int e) {
    // int[] mix = new int[e - s];

    // int i = s;
    // int j = m;
    // int k = 0;

    // while (i < m && j < e) {
    // if (arr[i] < arr[j]) {
    // mix[k] = arr[i];
    // i++;
    // } else {
    // mix[k] = arr[j];
    // j++;
    // }
    // k++;
    // }

    // // it may be possible that one of the arrays is not complete
    // // copy the remaining elements
    // while (i < m) {
    // mix[k] = arr[i];
    // i++;
    // k++;
    // }

    // while (j < e) {
    // mix[k] = arr[j];
    // j++;
    // k++;
    // }

    // for (int l = 0; l < mix.length; l++) {
    // arr[s + l] = mix[l];
    // }
    // }

}