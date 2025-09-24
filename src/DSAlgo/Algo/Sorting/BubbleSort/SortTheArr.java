package DSAlgo.Algo.Sorting.BubbleSort;

import java.util.Arrays;

public class SortTheArr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 };
        // Use a single BubbleSort method for clarity
        bubbleSortAscending(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));

        int[] arr2 = {5, 4, 2, 3, 1};
        bubbleSortDescending(arr2);
        System.out.println("Descending Order: " + Arrays.toString(arr2));
    }
    
    // For Ascending Order
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    
    // For Descending Order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}