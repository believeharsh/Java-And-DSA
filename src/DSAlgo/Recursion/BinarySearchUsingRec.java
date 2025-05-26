package DSAlgo.Recursion;

public class BinarySearchUsingRec {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 50, 55, 78, 89, 100 };
        int target = 55;
        // search(arr, target, 0, arr.length - 1);
        System.out.println(search(arr, target, 0, arr.length - 1)) ; 
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int m = start + (end - start) / 2;
        if (arr[m] == target) {
            return m;
        } else if (target < arr[m]) {
            return search(arr, target, start, m - 1);
        }
        return search(arr, target, m + 1, end);

    }
}
