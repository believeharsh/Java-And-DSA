package Practice;

public class BinarySearchImplmentation {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90} ; 
        System.out.println(binaryserach(arr1, 50));

        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 1} ; 
        System.out.println(binaryserach(arr2, 5));
    }

    static int binaryserach(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        boolean ascn = arr[low] < arr[high];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (ascn) {
                if (target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

        }
        return - 1 ; 
    }
}
