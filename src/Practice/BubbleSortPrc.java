package Practice;

import java.util.Arrays;

public class BubbleSortPrc {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 5} ; 
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }

    // this is for the descending order array sorting 
    // static int[] BubbleSort(int[] arr) {
    //     boolean swapped = false ; 
    //     int n = arr.length ; 
    //     for(int i = 0 ; i < n ; i++) {
    //         for(int j = 1 ; j < n - i ; j++ ) {
    //             if(arr[j] > arr[j - 1] ){
    //                 swap(arr,  j, j - 1) ; 
    //                 swapped = true ; 
    //             }
    //         }
    //         if(!swapped){
    //             break ; 
    //         }
    //     }
    //     return arr ; 
    // }

    // this is for the ascending order array sorting 
    static int[] BubbleSort(int[] arr) {
        boolean swapped = false ; 
        int n = arr.length ; 
        for(int i = 0 ; i < n ; i++) {
            for(int j = 1 ; j < n - i ; j++ ) {
                if(arr[j] < arr[j - 1] ){
                    swap(arr,  j, j - 1) ; 
                    swapped = true ; 
                }
            }
            if(!swapped){
                break ; 
            }
        }
        return arr ; 
    }

    static void swap(int[] arr, int i , int j) {
        int temp = arr[i] ; 
        arr[i] = arr[j] ; 
        arr[j] = temp ; 
    }
}
