package DSAlgo.Algo.Sorting.CycleSort;
// Problem Link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;

// this code works perfectly for all the arrays that even contains duplicates value ; 
// This code is not giving 12 as a missing number is that it only looks for missing numbers within the range of the input array's length (n). Since the array provided is of length 11, the algorithm only checks for missing numbers in the range [1, 11].

public class FindAllMissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 6, 7, 8, 10, 11, 11, 13};
        System.out.println(findAllMissing(arr));
    }

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