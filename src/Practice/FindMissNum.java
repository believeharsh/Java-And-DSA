package Practice;

public class FindMissNum {
    public static void main(String[] args) {
        int res = missingNumber(new int[] { 1, 3, 0, 4 });
        System.out.println(res); // Output: 2
    }

    static int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int rightInd = arr[i];
            if (arr[i] < n && arr[i] != arr[rightInd] && arr[i] >= 0) {
                swap(arr, i, rightInd);
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j) {
                return j;
            }

        }
        return arr.length;

        // return binarySearch(arr);
    }

    static void swap(int[] arr, int i, int rightInd) {
        int temp = arr[i];
        arr[i] = arr[rightInd];
        arr[rightInd] = temp;
    }

    // static int binarySearch(int[] arr) {
    // int left = 0;
    // int right = arr.length - 1;
    // while (left <= right) {
    // int mid = left + (right - left) / 2;
    // if (arr[mid] > mid) {
    // right = mid - 1;
    // } else {
    // left = mid + 1;
    // }
    // }
    // return left;
    // }
}
