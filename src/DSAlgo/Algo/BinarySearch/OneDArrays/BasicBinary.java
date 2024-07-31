package DSAlgo.Algo.BinarySearch.OneDArrays;

public class BasicBinary {
    public static void main(String[] args) {
        int[] arr1 = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 }; // ascending order
        int[] arr2 = { 89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18 }; // descending order
        int target = 45;
        int ans1 = binarySearch1(arr1, target);
        int ans2 = binarySearch2(arr2, target);
        System.out.println(ans1); // expected index = 11 ; 
        System.out.println(ans2); // expected index = 1 ; 
    }
    // This Function is for ascending ordered array
    static int binarySearch1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
    
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
    static int binarySearch2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
