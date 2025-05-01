package Practice;

public class CelingOfNum {
    // Question : You have given a sorted array in non-decresing order (ascending)
    // and one target element. you just have to return the ceiling of this number in
    // the array.
    // ceiling number is the smallest number in the arr that is actully grater than
    // or equal to the target.

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 9, 14, 16, 18, 19 };
        int target = 15;
        System.out.println("the ceiling of target 15 is " + ceilingOfNum(arr, target)); // expected output should be 5

    }

    static int ceilingOfNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
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
        return start;
    }

}
