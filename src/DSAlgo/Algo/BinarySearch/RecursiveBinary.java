package DSAlgo.Algo.BinarySearch;

public class RecursiveBinary {
    // Iterative Approach: Generally preferred in practice for binary search due to its constant space complexity and avoidance of stack overflow issues.
    // Recursive Approach: Can be used when clarity and brevity of code are prioritized, and when the array size is small enough that stack overflow is not a concern.
    public static void main(String[] args) {
        // RecursiveBinary search = new RecursiveBinary();
        int[] array = { 1, 3, 5, 7, 9, 11, 13, 15 };
        int target = 7;
        int low = 0;
        int high = array.length - 1;
        // int result = search.binarySearchRecursive(array, target, low, high);
        int result = binarySearchRecursive(array, target, low, high);
        System.out.println("Target found at index: " + result); // should print 7
    }

    // if we know that input array is sorted in assecending order ;
    static int binarySearchRecursive(int[] array, int target, int low, int high) {
        // Base case: target is not found
        if (low > high) {
            return -1;
        }

        // Calculate the middle index
        int mid = low + (high - low) / 2;

        // Check if the middle element is the target
        if (array[mid] == target) {
            return mid;
        }

        // Recursively search in the left subarray
        if (array[mid] > target) {
            return binarySearchRecursive(array, target, low, mid - 1);
        }

        // Recursively search in the right subarray
        return binarySearchRecursive(array, target, mid + 1, high);
    }
}
