package DSAlgo.Algo.BinarySearch.OneDArrays;

// problem link : 
// https://leetcode.com/problems/split-array-largest-sum/ 
public class SplitArrLargestSum {

    public static void main(String[] args) {
        // Define test cases and expected results
        int[][] testCases = {
                { 7, 2, 5, 10, 8 },
                { 1, 2, 3, 4, 5 },
                { 1, 4, 4 }
        };

        int[] kValues = { 2, 2, 3 }; // Corresponding k values for each test case

        int[] expectedResults = { 18, 9, 4 }; // Expected results for comparison

        // Run test cases
        for (int i = 0; i < testCases.length; i++) {
            int result = splitArray(testCases[i], kValues[i]);
            System.out.println("Test case " + (i + 1) + ": Expected = " + expectedResults[i] + ", Got = " + result);
        }
    }

    static int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }
        while (left < right) {
            int mid = (right - left) / 2 + left;
            int count = helper(nums, k, mid);
            if (count <= k)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    static int helper(int[] nums, int k, int mid) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > mid) {
                count++;
                sum = nums[i];
            }
        }
        return count;
    }
}