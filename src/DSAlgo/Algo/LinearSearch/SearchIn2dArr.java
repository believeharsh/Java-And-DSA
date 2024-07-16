package DSAlgo.Algo.LinearSearch;

import java.util.Arrays;

public class SearchIn2dArr {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 11, 12}, 
            {13, 14, 15, 16}, 
            {17, 18, 19}, 
            {20, 21}
        };
        int target = 16 ; 
        int[] ans = searchIn2dArr(arr, target);
        System.out.println(Arrays.toString(ans));

      System.out.println(minValue(arr));

    }

    static int[] searchIn2dArr(int[][] arr , int target) {
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return  new int[]{-1, -1} ; 
    }


    static int minValue(int[][] arr) {
        int max = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element < max) {
                    max = element ; 
                }
            }
        }
        return max;
    }
}
