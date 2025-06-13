package DSAlgo.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        // sort(arr, 0, arr.length - 1);
        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    // Kunal's sort functions
    // static void sort(int[] nums, int low, int hi) {
    // if (low >= hi) {
    // return;
    // }

    // int s = low;
    // int e = hi;
    // int m = s + (e - s) / 2;
    // int pivot = nums[m];

    // while (s <= e) {

    // // also a reason why if its already sorted it will not swap
    // while (nums[s] < pivot) {
    // s++;
    // }
    // while (nums[e] > pivot) {
    // e--;
    // }

    // if (s <= e) {
    // int temp = nums[s];
    // nums[s] = nums[e];
    // nums[e] = temp;
    // s++;
    // e--;
    // }
    // }

    // // now my pivot is at correct index, please sort two halves now
    // sort(nums, low, e);
    // sort(nums, s, hi);
    // }

    // sharddha ma'am implemention

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotInd = partition(arr, start, end);
            quickSort(arr, start, pivotInd - 1);
            quickSort(arr, pivotInd + 1, end);
        }
    }
     // Time complexity : in best case and average cases it gives that ( n log n) but in worst case it can take the O(n*n)
    // Lomuto’s partition scheme
    static int partition(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;

        // Swap middle element with end to use it as pivot
        swap(arr, mid, end);

        int pivot = arr[end];
        int index = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                index++;
                // swap arr[j] and arr[index]
                swap(arr, j, index);
            }
        }

        index++;
        swap(arr, end, index);

        return index;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
