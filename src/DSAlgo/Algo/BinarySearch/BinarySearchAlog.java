package DSAlgo.Algo.BinarySearch;

public class BinarySearchAlog {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50, 60 };
        int[] arr2 = { 60, 50, 40, 30, 20, 10};
        int target = 40;
        System.out.println("Index of target: " + IndexOfTarget(arr1, target));
        System.out.println("Index of target: " + IndexOfTarget2(arr2, target));


    }

    // this function will work if the array is sorted in asscending order
    static int IndexOfTarget(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // target not found
    }
    
        // what if the we don't know whether array is sorted in ascending order or
    // descending order

    // - 📌 Order-Agnostic Binary Search
    // - Works on both ascending and descending sorted arrays.
    // - First determine order using first and last elements.
    // - Then apply binary search logic accordingly.
    // - Time Complexity: O(log n)

    static int IndexOfTarget2(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        boolean ascending = arr[low] < arr[high];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ascending) {
                if (target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

        }

        return -1; // target not found
    }

}
