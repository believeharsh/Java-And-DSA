package Practice;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 9, 14, 16, 18, 19 };
        int target = 15;

        System.out.println("The floor of target 15 is at index: " + floorOfNum(arr, target)); // Expected output: 4
    }


    static int floorOfNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Edge case: if target is smaller than the smallest element
        if (target < arr[start]) {
            return -1;
        }

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
        // At this point, end is pointing to the largest element <= target
        return end;
    }
}
