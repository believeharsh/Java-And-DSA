package DSAlgo.Algo.Sorting.SelectionSort;
import java.util.Arrays;

// Example of Selection sort  : 

// Selection Sort : first of all we assume that the first element is the smallest element of the array  then we compare this element with the rest of the elements of an array. If we found the any other smallest number then will swap it with the first element of the array. we'll run this process until the array is sorted. 

public class Selection {
    // since we are comaparing and swapping in each time in remaining unsorted part of the array so it will work on the arrays that contains duplicate integers. 
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 0, 1, 12, 9, 3, 0};
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++) {
            int minInd = i;
            // here we are assuming the first element as a smaller one in the unsorted part of an array. 
            for (int j = i + 1; j < n; j++) {
                // this loop is calculating the samller elem each time in the unsorted part . 
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }
            // here we are swapping the smallest element with the first element of the unsorted part . 
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;

        }
    }

}
