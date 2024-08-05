package Practice;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 5, 7, 9, 10, 12 };
        // let's check the bubble sort function here : 
        // Bubble(arr);
        // System.out.println(Arrays.toString(arr));

        // let's check the Selection sort function here : 
        selectionSort(arr);
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
        int n = arr.length ; 
        boolean swapped ; 
        
        for(int i = 0 ; i < n - 1 ; i++) {
            int minInd = i ; 
            swapped = false ; 
            for(int j = i + 1 ; j < n ; j++){
                if(arr[j] < arr[j-1]){
                    arr[i] = j ; 
                  
                };
                SwapValues(arr, i, minInd);
                swapped = true ;
                if(!swapped){
                    break ; 
                }
            }

        }
    }

    public static void SwapValues(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}