package Practice;

public class TargetInInfiniteArr {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 13, 15, 18, 20, 22, 25, 30 }; // sorted array
        int target = 18;
        int ans = searchInInfiniteArr(nums, target);
        System.out.println(ans);
    }

    static int searchInInfiniteArr(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end + 1;
            end *= 2;
        } // here we are taking the window size 2 and checking, if answer lies in the
          // window then loop will break and binary search will be applied, otherwise
          // window will get's double each time.
          // botoom up approach

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
