package DSAlgo.Algo.Sorting.CycleSort ; 
import java.util.Arrays;
public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2,5};
       
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
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