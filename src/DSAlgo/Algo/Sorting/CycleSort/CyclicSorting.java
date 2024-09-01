package DSAlgo.Algo.Sorting.CycleSort ; 
import java.util.Arrays;
public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 3, 1, 2 };
        int[] arr2 = {6, 5, 3, 3, 1, 0, 2 };
       
       
        // cyclicSort(arr);j
        cyclicSort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void cyclicSort(int[] arr) {
        // this function will work for the arrays ranges from 1 to N : 
        int n = arr.length;
        int crntInd = 0;

        while (crntInd < n) {
            int rightInd = arr[crntInd] - 1; // since we know that array's first value will be one

            // Ensure that arr[crntInd] is within the range and not in its correct position
            // already
            if (arr[crntInd] > 0 && arr[crntInd] < n && arr[crntInd] != arr[rightInd]) {
                swap(arr, crntInd, rightInd);
            } else {
                crntInd++;
            }
        }
    }
    public static void cyclicSort2(int[] arr) {
        int n = arr.length;
        int crntInd = 0;
    
        while (crntInd < n) {
            int rightInd = arr[crntInd];
    
            // Modify condition to include 0 and exclude n
            if (arr[crntInd] >= 0 && arr[crntInd] < n && arr[crntInd] != arr[rightInd]) {
                swap(arr, crntInd, rightInd);
            } else {
                crntInd++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}