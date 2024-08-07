package DSAlgo.Algo.Sorting.CycleSort ; 
import java.util.Arrays;
public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 3, 1, 2 };
       
       
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        // this function will work for the arrays ranges from 1 to N : 
        int n = arr.length;
        int crntInd = 0;

        while (crntInd < n) {
            int rightInd = arr[crntInd] - 1;

            // Ensure that arr[crntInd] is within the range and not in its correct position
            // already
            if (arr[crntInd] > 0 && arr[crntInd] <= n && arr[crntInd] != arr[rightInd]) {
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