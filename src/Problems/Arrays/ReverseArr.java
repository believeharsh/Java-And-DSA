package Problems.Arrays;

import java.util.Arrays;

public class ReverseArr {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 5} ; 

        System.out.println(Arrays.toString(revreseArr(arr)));

    }
    static int[] revreseArr(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[j] = arr[i];
            j++;
        }
        return reversedArr;
    }
}
