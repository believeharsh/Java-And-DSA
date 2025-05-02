package Practice;
import java.util.Arrays;

public class findFirstAndLastIndexInArr{
    public static void main(String[] args) {
        // Sample input
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        Solution sol = new Solution();
        int[] result = sol.searchRange(nums, target);

        // Print result
        System.out.println("Target " + target + " found at indices: " + Arrays.toString(result));
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int startIdx = search(nums, target, true);
        int lastIdx = search(nums, target, false);
        ans[0] = startIdx;
        ans[1] = lastIdx;

        return ans;
    }

    int search(int[] arr, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
