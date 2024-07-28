package DSAlgo.Algo.BinarySearch;

public class RoationCount {

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                { 4, 5, 6, 7, 0, 1, 2 }, // Simple Rotated Array
                { 1, 2, 3, 4, 5, 6, 7 }, // Fully Rotated Array
                { 1 }, // Single Element Array
                { 2, 1 }, // Two Elements Array
                { 2, 2, 2, 0, 1 }, // Array with Duplicates
                { 1, 2, 3, 4, 5 } // Non-Rotated Array
        };

        // Expected results
        int[] expectedResults = {
                0, // Simple Rotated Array
                1, // Fully Rotated Array
                1, // Single Element Array
                1, // Two Elements Array
                0, // Array with Duplicates
                1 // Non-Rotated Array
        };

        // Run test cases
        for (int i = 0; i < testCases.length; i++) {
            int result = pivot(testCases[i]);
            System.out.println("Test case " + (i + 1) + ": Expected = " + expectedResults[i] + ", Got = " + result);
        }
    }

    // Index of the smallest interger of the array is equal to the pivot index and
    // also the roatation count
    // of an array as well

    

    static int pivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] <= nums[right]) {
                return nums[left];
            }
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}