package DSAlgo.Recursion ; 

import java.util.Arrays;

public class SelectionSortUsingRec {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1} ; 
        // First Approach 
        // SelectionSortRec(arr, arr.length, 0, 0);
        // System.out.println(Arrays.toString(arr)) ; 


        // Second Appraoch 
        selectionSort(arr) ; 
        System.out.println(Arrays.toString(arr)) ; 
    }


    
     // First Approach using the col, row and the max 
    /* static void SelectionSortRec(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
                SelectionSortRec(arr, row, col + 1, col);
            } else {
                SelectionSortRec(arr, row, col + 1, max);
            }

        } else {
            int temp = arr[max] ; 
            arr[max] = arr[row - 1] ; 
            arr[row - 1] = temp ; 
            SelectionSortRec(arr, row - 1, 0, 0);
        }
    } */ 



    // Second Appraoch using the simple ans staright forward code 
    // Public method
    static void selectionSort(int[] arr) {
        sortHelper(arr, arr.length, 0);
    }

    // Recursive function to perform selection sort
    private static void sortHelper(int[] arr, int n, int index) {
        if (index == n - 1) {
            return; // base case: sorted
        }

        // Find index of the max element in the unsorted part
        int maxIndex = findMaxIndex(arr, index, n - 1, index);

        // Swap max element with the last element in unsorted part
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[n - 1];
        arr[n - 1] = temp;

        // Recursive call for remaining array
        sortHelper(arr, n - 1, 0);
    }

    // Recursive function to find index of maximum element
    private static int findMaxIndex(int[] arr, int start, int end, int maxIndex) {
        if (start > end) {
            return maxIndex;
        }

        if (arr[start] > arr[maxIndex]) {
            maxIndex = start;
        }

        return findMaxIndex(arr, start + 1, end, maxIndex);
    }
}
