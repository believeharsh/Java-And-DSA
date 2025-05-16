package DSAlgo.Algo.Sorting.CycleSort;
// Problem Link : https://leetcode.com/problems/first-missing-positive/

public class FirstPostiveMisNum {
    // As the Question ask that give the smallest positive integer so we know that
    // this value can be from 1 to n. so that we'll sort the array from 1 to n range
    // as well.
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0 }; // missing number is = 3
        int[] arr1 = { 2, 3, 5, 6, 4, 8, 1 }; // missing number is = 7
        int[] arr2 = { 2, 4, 0, 6, 5, 9, 8, 7, 3 }; // missing number is = 1
        System.out.println(findSmallMissingPos(arr));
        System.out.println(findSmallMissingPos(arr1));
        System.out.println(findSmallMissingPos(arr2));

    };

    public static int findSmallMissingPos(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
