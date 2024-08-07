package Practice;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 3, 1, 2 };  // should print {1,2,3, 3, 5, 6} 
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // let's check the bubble sort function here :
        // Bubble(arr);
        // System.out.println(Arrays.toString(arr));

        // let's check the Selection sort function here :
        // selectionSort(arr);
        // System.out.println(Arrays.toString(arr));

        // let's check the Insertin sort function here :
        // insertionSort(arr);
        // System.out.println(Arrays.toString(arr));

        // let's check the Cyclic sort function here :
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    };

    public static void Bubble(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 1; j < n - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    SwapValues(arr, j, j - 1);
                    swapped = true;
                }
                if (!swapped) {
                    break;
                }
            }
        }

    };

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            int minInd = i;
            swapped = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    arr[i] = j;

                }
                ;
                SwapValues(arr, i, minInd);
                swapped = true;
                if (!swapped) {
                    break;
                }
            }

        }
    };

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 1; i < n; i++) {
            swapped = false;
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    SwapValues(arr, j, j - 1);
                    swapped = true;

                }
                if (!swapped) {
                    break;
                } else {
                    break;
                }

            }
        }
    };

    public static void cycleSort(int[] arr){
        int n = arr.length ; 
        int crntInd = 0 ; 
        while(crntInd < n) {
            int rightInd = arr[crntInd] - 1 ; 
            // since we are sorting the array that ranges from 1 to N : 
            // Note that this function will work if all the values will be available in the unsorted arrays from range 1 to N 
            if(arr[crntInd] < n && arr[crntInd] != arr[rightInd] && arr[crntInd] > 0 ){
                SwapValues(arr, crntInd, rightInd);
            }
           
            else{
                crntInd++ ; 
            }
        };

    }

    public static void SwapValues(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}