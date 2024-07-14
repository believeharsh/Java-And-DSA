package DSAlgo.DS.Arrays;

import java.util.Arrays;

public class TDArray {
    public static void main(String[] args) {
        System.out.println("Printing the 2d Array here : ");

        int arr[][] = {
            {1, 2, 3, 4},
            {5, 4, 7},
            {9, 0, 4, 3}, 
            {2, 3}
        };

        // using traditional for loop for iterating 
        // for (int row = 0; row < arr.length; row++) {
        //     for(int col = 0 ; col < arr[row].length ; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int[] a : arr) {
        //     System.out.println(Arrays.toString(a));
        // }

        for(int row = 0 ; row < arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
