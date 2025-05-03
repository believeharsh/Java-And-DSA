package DSAlgo.Algo.BinarySearch.OneDArrays;

public class FindInMountainArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int index = findInMountainArray(arr, target);
        System.out.println("Target found at index: " + index);
    }

    public static int findInMountainArray(int[] arr, int target) {
        int peak = findPeakIndex(arr);

        // Search in increasing part
        int index = binarySearch(arr, target, 0, peak, true);
        if (index != -1) return index;

        // Search in decreasing part
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }

    // Step 1: Find peak index
    private static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    // Step 2: Order-agnostic binary search
    private static int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (ascending) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
