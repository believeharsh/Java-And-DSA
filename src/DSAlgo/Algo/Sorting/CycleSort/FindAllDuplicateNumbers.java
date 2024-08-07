package DSAlgo.Algo.Sorting.CycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 7}; // Duplicate numbers are {2, 3}
        int[] arr2 = {1, 1, 2, 2, 3, 3, 4, 4}; // Duplicate numbers are {1, 2, 3, 4}
        System.out.println(findAllDuplicates(arr));
        System.out.println(findAllDuplicates(arr2));
    }

    public static List<Integer> findAllDuplicates(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            while (arr[i] != i + 1) {
                int rightInd = arr[i] - 1;
                if (arr[i] != arr[rightInd]) {
                    swap(arr, i, rightInd);
                } else {
                    break; // break the loop if we find a duplicate
                    // here we can also write crntInd++.
                    // Note : when inner loops breaks then outer loop automatically goes to the next iteration by incrementing crntind
                }
            }
        }

        // Now check for duplicates
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);
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