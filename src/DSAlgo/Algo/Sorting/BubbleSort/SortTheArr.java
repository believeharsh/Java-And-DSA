package DSAlgo.Algo.Sorting.BubbleSort;

// problem link : https://leetcode.com/problems/sort-colors/ 
import java.util.Arrays;

public class SortTheArr {

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1} ; 
        BubbleSort(arr) ; 
        System.out.println(Arrays.toString(arr));

    }

    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;

            // this is the loop if we want descending order ; 
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }
            }
            // this is the loop if we want ascending order : 
            // for (int j = 1; j < n - i; j++) {
            //     if (arr[j] < arr[j - 1]) {
            //         int temp = arr[j];
            //         arr[j] = arr[j-1];
            //         arr[j-1] = temp;
            //         swapped = true;

            //     }
            // }
            if(!swapped) {
                break ; 
            }
        }
       

    }
}