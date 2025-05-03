package Practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 6, 4, 7, 9, 8, 0} ; 
        sortTheArr(arr); 
        System.out.println(Arrays.toString(arr));
    }

    static void sortTheArr(int[] arr) {
        int n = arr.length ; 
        boolean swapped = false ; 

        for(int i = 0 ; i < n ; i++) {

            for(int j = 1 ; j < n - i ; j++) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j] ; 
                    arr[j] = arr[j - 1] ; 
                    arr[j - 1] = temp ; 
                    swapped = true ; 
                }
            }

            if(!swapped){
                break ; 
            }
        }
    }
}
