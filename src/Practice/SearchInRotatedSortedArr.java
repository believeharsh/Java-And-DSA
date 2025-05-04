package Practice;

public class SearchInRotatedSortedArr {
    public static void main(String[] arr) {
        int[] arr1 = {4,5,6,7,0,1,2} ; 
        int target1 = 0 ; 

        int[] arr2 = {4,5,6,7,0,1,2} ; 
        int target2 = 3 ; 
        System.out.println("Target 0 in the arr1 lies in " + search(arr1, target1) );
        System.out.println("Target 3 in the arr1 lies in " + search(arr2, target2) );
    }


    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // Case 1: Not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // Case 2: Found target at pivot
        if (arr[pivot] == target)
            return pivot;

        // Case 3: Target in left sorted part
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        // Case 4: Target in right sorted part
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    static  int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Left part is sorted, move right
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                // Right part is sorted, move left
                end = mid - 1;
            }
        }
        // and if the 
        return -1;
    }
}
