package DSAlgo.Algo.Sorting.CycleSort;

import java.util.Arrays;

// Problem Link : https://leetcode.com/problems/set-mismatch/description/

public class FindMistmatch {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 2, 4 }; // Numbers Should be {2, 3};
        int[] arr2 = { 1, 1 }; // Number should be {1,2}

          System.out.println(Arrays.toString(findErrorNums(arr1)));
        System.out.println(Arrays.toString(findErrorNums(arr2)));

    };

    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}