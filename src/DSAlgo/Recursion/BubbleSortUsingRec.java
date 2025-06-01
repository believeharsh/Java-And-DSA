package DSAlgo.Recursion;

import java.util.Arrays;

public class BubbleSortUsingRec {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };

        // First Approach 
        SortArrUsingBubbleRev(arr) ; 
        System.out.println(Arrays.toString(arr));


        // Second Approach
        // SortArrUsingBubbleRev(arr, arr.length - 1, 0);

    }

    // First Approach
    static void SortArrUsingBubbleRev(int[] arr) {
        bubbleSortHelper(arr, arr.length);

    }

    static void bubbleSortHelper(int[] arr, int n) {
        // Base case: when array size becomes 1
        if (n == 1) {
            return;
        }

        // One pass of bubble sort (largest element moves to end)
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for remaining array
        bubbleSortHelper(arr, n - 1);
    }

    // second approach

    /*
     * static void SortArrUsingBubbleRev(int[] arr, int row, int col) {
     * 
     * if (row == 0) {
     * return;
     * }
     * if (col < row) {
     * if (arr[col] > arr[col + 1]) {
     * int temp = arr[col];
     * arr[col] = arr[col + 1];
     * arr[col + 1] = temp;
     * }
     * SortArrUsingBubbleRev(arr, row, col + 1);
     * } else {
     * SortArrUsingBubbleRev(arr, row - 1, 0);
     * }
     * 
     * }
     */

}
