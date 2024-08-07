package Practice;

// Problem Link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// this code works perfectly for all the arrays that even contains duplicates value ; 
// This code is not giving 12 as a missing number is that it only looks for missing numbers within the range of the input array's length (n). Since the array provided is of length 11, the algorithm only checks for missing numbers in the range [1, 11].

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[][] arrays = {

                { 0, 1, 2, 3, 4, 5 }, // missing number is {6} ;
                {2, 4, 4, 5, 6, 7, 9, 6}, // missing number are {1, 3,8} 
                {1, 2, 3, 5, 7, 8, 9}, // missing number are {4, 6} 
                {1, 2, 3, 4, 5, 6} // missing number are {} 
        };
        int[] arr = { 0, 1, 2, 3, 4, 5 };
        findAllMissing(arr);
        System.out.println(Arrays.toString(arr));
        
        // Iterate through each array and find the missing number
        for (int i = 0; i < arrays.length; i++) {
        System.out.println("Missing number in arr" + (i + 1) + ": " +
        findAllMissing(arrays[i]));
        }
    }
    // Knowledge : if you are running any loop for index i = 0 to till i < n, but if
    // the index get invalid ( -1) the related code will get skipped and next code
    // will be executed.

    public static List<Integer> findAllMissing(int[] arr) {

        int n = arr.length;
        int crntInd = 0;

        while (crntInd < n) {
            int rightInd = arr[crntInd] - 1;
            if (arr[crntInd] > 0 && arr[crntInd] <= n && arr[crntInd] != arr[rightInd]) {
                swap(arr, crntInd, rightInd);
            } else {
                crntInd++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        
        for (int index = 0; index < n; index++) {
        if (arr[index] != index + 1) {
        ans.add(index + 1);
        }
        }
        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}