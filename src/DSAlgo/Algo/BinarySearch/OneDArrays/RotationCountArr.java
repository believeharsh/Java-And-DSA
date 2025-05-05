package DSAlgo.Algo.BinarySearch.OneDArrays;


// This is the code for finding the rotation count in the rotated sorted arrays . 

public class RotationCountArr {
    public static void main(String[] args) {
        int[][] testCases = {
            { 4, 5, 6, 7, 0, 1, 2 }, // Simple Rotated Array
            { 1, 2, 3, 4, 5, 6, 7 }, // Fully Rotated Array
            { 1 }, // Single Element Array
            { 2, 1 }, // Two Elements Array
            {3, 3, 1, 3, 3, 3, 3},
            {2, 2, 2, 2, 2} , 
            { 1, 2, 3, 4, 5 } // Non-Rotated Array
        };

        // Expected results
        int[] expectedResults = {
            4, // Simple Rotated Array
            0, // Fully Rotated Array
            0, // Single Element Array
            1, // Two Elements Array
            2, // Array with Duplicates
            0, // non-roated array
            0  // Non-Rotated Array
        };

        // Run test cases
        for (int i = 0; i < testCases.length; i++) {
            int result = rotationCount(testCases[i]);
            System.out.println("Test case " + (i + 1) + ": Expected = " + expectedResults[i] + ", Got = " + result);
        }
    }

    static int rotationCount(int[] arr) {
        // int pivot = findPivotWithoutDuplicates(arr);
        int pivot = findPivotWithDuplicates(arr);
        return pivot == -1 ? 0 : pivot + 1;
    }

    // this is when array doesn't contain the duplicates 
    static int findPivotWithoutDuplicates(int[] arr) {
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

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    // this is used when array does conatain the duplicates as well 
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            // 4 cases to check
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
    
            // If elements at start, mid, end are equal, skip duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
    
                // Check if end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Left side is sorted, so pivot must be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    
        return -1;
    }

    

}
