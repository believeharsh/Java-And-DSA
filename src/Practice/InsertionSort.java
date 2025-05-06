package Practice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr2 = {6, 5, 3, 2, 1, 4, 0} ; 
        insertionSortAlgo(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void insertionSortAlgo(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (
                    arr[j] <  arr[j - 1] // this if condition for the ascending order
                    // arr[j] >  arr[j - 1] // this if condition for the descending order
                   ) { 
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
