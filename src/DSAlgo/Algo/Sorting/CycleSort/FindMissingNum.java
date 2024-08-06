package DSAlgo.Algo.Sorting.CycleSort;

// Problem Link : https://leetcode.com/problems/missing-number/

public class FindMissingNum {
    // this code will work with the duplicates value as well . 
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 0, 4 }; // missing number is 2 ;
        int[] arr2 = { 1, 2, 3, 4, 5 }; // missing number is 0 ;
        int[] arr3 = { 0, 1, 2, 3, 4, 5 }; // nothing is missing;
        int[] arr4 = { 0, 1, 2, 3, 5 }; // missing number is 4 ;
        int[] arr5 = {6, 5, 3, 3, 1, 2 }; // missing number is 0 ;
        // System.out.println(findMissing(arr1));
        // System.out.println(findMissing(arr2));
        // System.out.println(findMissing(arr3));
        // System.out.println(findMissing(arr4));
        System.out.println(findMissing(arr5));

    };

    public static int findMissing(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int rightInd = arr[i];
            if (arr[i] < n && arr[i] != arr[rightInd]) {
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
