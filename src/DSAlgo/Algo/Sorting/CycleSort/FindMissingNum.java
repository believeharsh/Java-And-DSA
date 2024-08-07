package DSAlgo.Algo.Sorting.CycleSort;
// Problem Link : https://leetcode.com/problems/missing-number/

public class FindMissingNum {
    // this code will work with the duplicates value as well .
    public static void main(String[] args) {
        int[][] arrays = {
                { 1, 3, 0, 4 }, // missing number is 2
                { 1, 2, 3, 4, 5 }, // missing number is 0
                { 0, 1, 2, 3, 4, 5 }, // nothing is missing 6 
                { 0, 1, 2, 3, 5 }, // missing number is 4
                { 6, 5, 3, 3, 1, 2 } // missing number is 0
        };

        // Iterate through each array and find the missing number
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Missing number in arr" + (i + 1) + ": " + findMissing(arrays[i]));
        }

    };

    public static int findMissing(int[] arr) {
        // Here we are writing for the arrays which ranges from 0 to N 
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int rightInd = arr[i]; // because first element is 0 so lenght will be 0 and so on. 
            if (arr[i] < n && arr[i] != arr[rightInd] && arr[i] >= 0) {
                swap(arr, i, rightInd);
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j) {
                return j;
            }

        }
        return arr.length;

    };

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
